package net.android.parler.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import net.android.parler.model.JsonData

@Dao
interface PostDao {

    @Query("SELECT * FROM jsondata")
    fun allJson(): JsonData

    @Insert(onConflict = REPLACE)
    fun insertJson(vararg jsonData: JsonData)
}