package com.tablayout.BottomNav_Part2exercize.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface AbstDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun save(data: DataModel)

    @Query("SELECT * FROM DataModel")
    fun getdata(): List<DataModel>

    @Query("SELECT * FROM DataModel")   /// этот метод позв без перезагрузки app сразу вставл синхрон данные
    fun getdatalive(): LiveData<List<DataModel>>
}