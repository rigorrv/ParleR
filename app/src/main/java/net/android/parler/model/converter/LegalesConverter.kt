package net.android.parler.model.converter

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import net.android.parler.model.Legales

class LegalesConverter {

    @TypeConverter
    fun stringToLegales(string: String): Legales?{
        val type = object : TypeToken<Legales>(){}.type
        return Gson().fromJson<Legales>(string, type)
    }

    @TypeConverter
    fun LegalesToString(Legales: Legales):String{
        val type = object : TypeToken<Legales>(){}.type
        return Gson().toJson(Legales, type)
    }
}