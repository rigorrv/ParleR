package net.android.parler.model.converter

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import net.android.parler.model.Shop

class ShopConverter {

    @TypeConverter
    fun stringToShop(string: String): Shop?{
        val type = object : TypeToken<Shop>(){}.type
        return Gson().fromJson<Shop>(string, type)
    }

    @TypeConverter
    fun ShopToString(Shop: Shop):String{
        val type = object : TypeToken<Shop>(){}.type
        return Gson().toJson(Shop, type)
    }
}