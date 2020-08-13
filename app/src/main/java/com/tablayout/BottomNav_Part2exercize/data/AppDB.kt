package com.tablayout.BottomNav_Part2exercize.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [DataModel::class],version = 2)
abstract class AppDB:RoomDatabase() {
   abstract fun getDataModel(): AbstDao
}