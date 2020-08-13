package com.tablayout.BottomNav_Part2exercize

import android.app.Application
import androidx.room.Room
import com.tablayout.BottomNav_Part2exercize.data.AppDB

class App : Application () {
    private var db: AppDB?=null

    override fun onCreate() {
        super.onCreate()
        app=this
        db=Room.databaseBuilder(this, AppDB::class.java,DB_NAME)
            .allowMainThreadQueries()
            .build()
    }
    fun getDb()=db

    companion object {
        private const val DB_NAME = "DB_NAME"
        var app: App? =null

    }
}