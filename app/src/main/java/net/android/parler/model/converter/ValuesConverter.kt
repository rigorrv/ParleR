package net.android.parler.model.converter

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import net.android.parler.model.Values

class ValuesConverter {

    @TypeConverter
    fun stringToValues(string: String): Values?{
        val type = object : TypeToken<Values>(){}.type
        return Gson().fromJson<Values>(string, type)
    }

    @TypeConverter
    fun ValuesToString(Values: Values):String{
        val type = object : TypeToken<Values>(){}.type
        return Gson().toJson(Values, type)
    }
}