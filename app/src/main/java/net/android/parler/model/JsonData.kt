package net.android.parler.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Entity
@Parcelize
data class JsonData(
    @PrimaryKey
    val about: About,
    val contact: Contact,
    val legales: Legales,
    val main: Main,
    val shop: Shop,
    val values: Values
) : Parcelable