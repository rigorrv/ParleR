package net.android.parler.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Entity
@Parcelize
data class Shop(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val address: String,
    val background: String,
    val btn1: String,
    val btn2: String,
    val info1: String,
    val logo: String,
    val secction1: String,
    val secction2: String,
    val secction3: String,
    val secction4: String,
    val secction5: String,
    val secction6: String,
    val secction7: String,
    val secctiontitle1: String,
    val secctiontitle3: String,
    val title: String
) : Parcelable