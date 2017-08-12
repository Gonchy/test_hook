package com.kepar.unicardkotlin.database.dao

import android.arch.persistence.room.Query
import com.kepar.unicardkotlin.database.entity.Brand
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert

/**
 * Created by User on 27.06.2017.
 */
public interface BrandDao {
    @Query("SELECT * FROM brand")
    fun getAll() : List<Brand>

    @Insert
    fun insertAll(vararg brands: Brand)

    @Delete
    fun delete(brand: Brand)

}