package com.tablayout.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DataClass (
    val image: Int,
    val textOne: String,
    val textTwo: String
): Parcelable
