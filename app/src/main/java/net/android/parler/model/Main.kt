package net.android.parler.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Entity
@Parcelize
data class Main(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val background: String,
    val buttonaccount: String,
    val buttonlogin: String,
    val info: String,
    val info1: String,
    val info2: String,
    val info3: String,
    val info4: String,
    val info5: String,
    val info6: String,
    val info7: String,
    val infologin: String,
    val subtitle1: String,
    val subtitle2: String,
    val subtitle3: String,
    val subtitle4: String,
    val subtitle5: String,
    val subtitle6: String,
    val subtitle7: String,
    val subtitleb61: String,
    val subtitlebg2: String,
    val subtitlebg3: String,
    val subtitlebg4: String,
    val subtitlebg5: String,
    val subtitlebg7: String,
    val title: String
) : Parcelable