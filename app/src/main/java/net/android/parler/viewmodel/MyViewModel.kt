package net.android.parler.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.NonCancellable
import kotlinx.coroutines.async
import net.android.parler.database.PostDao
import net.android.parler.model.JsonData
import net.android.parler.network.Api
import net.android.parler.utility.Connection
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MyViewModel(private val api: Api, private val postDao: PostDao) : ViewModel() {

    var jsonLiveData = MutableLiveData<JsonData>()

    init {
        if (Connection.isConnected())
            getJson()
        else
            loadSql()
    }

    private fun getJson() {
        api.getJson().enqueue(object : Callback<JsonData> {
            override fun onResponse(call: Call<JsonData>, response: Response<JsonData>) {
                jsonLiveData.value = response.body()
                saveSql(response.body()!!)
            }

            override fun onFailure(call: Call<JsonData>, t: Throwable) {
                Log.d("TAG", "onFailure: ${t}")
            }
        })
    }

    private fun saveSql(jsonData: JsonData) {
        viewModelScope.async(Dispatchers.IO + NonCancellable) {
            postDao.insertJson(jsonData)
        }
    }

    private fun loadSql() {
        viewModelScope.async(Dispatchers.IO + NonCancellable) {
            jsonLiveData.postValue(postDao.allJson())
        }
    }
}