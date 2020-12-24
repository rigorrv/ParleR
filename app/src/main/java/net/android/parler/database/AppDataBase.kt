package net.android.parler.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import net.android.parler.model.JsonData
import net.android.parler.model.converter.*

@Database(entities = [JsonData::class], version = 1)
@TypeConverters(
    AboutConverter::class,
    ContactConverter::class,
    LegalesConverter::class,
    MainConverter::class,
    ShopConverter::class,
    ValuesConverter::class
)
abstract class AppDataBase : RoomDatabase() {
    abstract fun postDao(): PostDao
}