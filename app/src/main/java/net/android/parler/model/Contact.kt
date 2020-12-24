package net.android.parler.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Entity
@Parcelize
data class Contact(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val address: String,
    val background: String,
    val buton1: String,
    val buton2: String,
    val email: String,
    val icon1: String,
    val icon2: String,
    val icon3: String,
    val info: String,
    val phone: String,
    val title: String
) : Parcelable