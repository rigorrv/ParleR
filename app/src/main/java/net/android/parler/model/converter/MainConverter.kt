package net.android.parler.model.converter

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import net.android.parler.model.Main

class MainConverter {

    @TypeConverter
    fun stringToMain(string: String): Main?{
        val type = object : TypeToken<Main>(){}.type
        return Gson().fromJson<Main>(string, type)
    }

    @TypeConverter
    fun MainToString(Main: Main):String{
        val type = object : TypeToken<Main>(){}.type
        return Gson().toJson(Main, type)
    }
}