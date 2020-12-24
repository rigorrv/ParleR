package net.android.parler.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Entity
@Parcelize
data class Legales(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val buton2: String,
    val buton3: String,
    val dowloadinfo: String,
    val info1: String,
    val info2: String,
    val info3: String,
    val info4: String,
    val legalsinfo: String,
    val subtitle1: String,
    val subtitle2: String,
    val subtitle3: String,
    val subtitle4: String
) : Parcelable