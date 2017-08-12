package com.kepar.unicardkotlin

import android.app.Application
import com.kepar.unicardkotlin.database.storio.UnicardSQLiteOpenHelper
import com.pushtorefresh.storio.sqlite.StorIOSQLite
import com.pushtorefresh.storio.sqlite.impl.DefaultStorIOSQLite

/**
 * Created by User on 10.07.2017.
 */

class UnicardApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        storIOSQLite = DefaultStorIOSQLite.builder()
                .sqliteOpenHelper(UnicardSQLiteOpenHelper(this, 1))
                .build()
    }

    companion object {
        var storIOSQLite: StorIOSQLite? = null
    }
}
