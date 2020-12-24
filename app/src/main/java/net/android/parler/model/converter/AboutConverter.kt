package net.android.parler.model.converter

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import net.android.parler.model.About

class AboutConverter {

    @TypeConverter
    fun stringToAbout(string: String): About?{
        val type = object : TypeToken<About>(){}.type
        return Gson().fromJson<About>(string, type)
    }

    @TypeConverter
    fun aboutToString(about: About):String{
        val type = object : TypeToken<About>(){}.type
        return Gson().toJson(about, type)
    }
}