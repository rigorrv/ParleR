package net.android.parler.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Entity
@Parcelize
data class About(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val background: String,
    val info: String,
    val info1: String,
    val info2: String,
    val info3: String,
    val subtitle1: String,
    val subtitle2: String,
    val subtitle3: String,
    val subtitlebg1: String,
    val subtitlebg2: String,
    val subtitlebg3: String,
    val title: String
) : Parcelable