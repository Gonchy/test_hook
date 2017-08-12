package com.kepar.unicardkotlin.database.room

import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.Database
import com.kepar.unicardkotlin.database.dao.BrandDao
import com.kepar.unicardkotlin.database.entity.Brand

/**
 * Created by User on 27.06.2017.
 */
@Database(entities = arrayOf(Brand::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): BrandDao
}