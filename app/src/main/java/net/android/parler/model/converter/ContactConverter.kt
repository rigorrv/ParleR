package net.android.parler.model.converter

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import net.android.parler.model.Contact

class ContactConverter {

    @TypeConverter
    fun stringToContact(string: String): Contact?{
        val type = object : TypeToken<Contact>(){}.type
        return Gson().fromJson<Contact>(string, type)
    }

    @TypeConverter
    fun ContactToString(Contact: Contact):String{
        val type = object : TypeToken<Contact>(){}.type
        return Gson().toJson(Contact, type)
    }
}