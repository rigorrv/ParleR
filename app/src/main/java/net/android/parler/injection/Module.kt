package net.android.parler.injection

import android.app.Application
import androidx.room.Room
import com.google.gson.GsonBuilder
import net.android.parler.database.AppDataBase
import net.android.parler.database.PostDao
import net.android.parler.network.Api
import net.android.parler.viewmodel.MyViewModel
import org.koin.android.ext.koin.androidApplication
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val apiModule = module {

    fun apiProvider(retrofit: Retrofit): Api {
        return retrofit.create(Api::class.java)
    }
    single {
        apiProvider(get())
    }
}

val networkModule = module {

    fun networkProvider(): Retrofit {
        val gson = GsonBuilder()
            .setLenient()
            .create()
        return Retrofit.Builder()
            .baseUrl("https://notificationfirebase-6fa04.firebaseio.com/")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
    }
    single {
        networkProvider()
    }
}

val dataBaseModule = module {

    fun dataBaseProvider(application: Application): AppDataBase {
        return Room.databaseBuilder(application, AppDataBase::class.java, "post")
            .fallbackToDestructiveMigration()
            .build()
    }

    fun postDaoProvider(appDataBase: AppDataBase): PostDao {
        return appDataBase.postDao()
    }

    single { dataBaseProvider(androidApplication()) }
    single { postDaoProvider(get()) }
}

val viewModelModule = module {

    viewModel {
        MyViewModel(get(), get())
    }
}