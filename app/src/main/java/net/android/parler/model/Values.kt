package net.android.parler.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Entity
@Parcelize
data class Values(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val background: String,
    val boxinfo1: String,
    val boxinfo2: String,
    val boxinfo3: String,
    val boxinfo4: String,
    val boxinfo5: String,
    val boxinfo6: String,
    val boxinfo7: String,
    val boxtitle1: String,
    val boxtitle2: String,
    val boxtitle3: String,
    val boxtitle4: String,
    val boxtitle5: String,
    val boxtitle6: String,
    val boxtitle7: String,
    val info: String,
    val info1: String,
    val info2: String,
    val subtitle1: String,
    val subtitle2: String,
    val subtitlebg1: String,
    val subtitlebg2: String,
    val subtitlebg3: String,
    val subtitlebg4: String,
    val subtitlebg5: String,
    val subtitlebg6: String,
    val subtitlebg7: String,
    val title: String
) : Parcelable