package com.kepar.unicardkotlin.database.storio

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

/**
 * Created by User on 10.07.2017.
 */

val DB_NAME = "storio.db"

class UnicardSQLiteOpenHelper : SQLiteOpenHelper {

    constructor(context: Context?, version: Int) : super(context, DB_NAME, null, version)

    override fun onCreate(sqLiteDatabase: SQLiteDatabase?) {
        createBrandsTable(sqLiteDatabase)
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {

    }

    fun createBrandsTable(db: SQLiteDatabase?) {
        db?.execSQL("CREATE TABLE " + "brands" + "("
                + "id PRIMARY KEY, "
                + "title TEXT, "
                + "logo TEXT"
                + ");")
    }
}