package com.tablayout.BottomNav_Part2exercize.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.RowId

@Entity
data class DataModel(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title : String,
    val titleTwo : String
)