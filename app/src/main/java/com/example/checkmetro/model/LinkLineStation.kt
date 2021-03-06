package com.example.checkmetro.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "LinkLineStation")
data class LinkLineStation (
    @PrimaryKey(autoGenerate = true) val id: Int,
    val codeLine:String,
    val slugStation: String
) : Parcelable