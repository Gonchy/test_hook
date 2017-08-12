package com.kepar.unicardkotlin.database.entity

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Created by User on 27.06.2017.
 */
@Entity()
class Brand {
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null
    @ColumnInfo(name = "title")
    var title: String? = null
    @ColumnInfo(name = "logo")
    val logo: String? = null
}