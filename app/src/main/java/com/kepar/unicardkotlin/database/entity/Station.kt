package com.kepar.unicardkotlin.database.entity

/**
 * Created by User on 27.06.2017.
 */
class Station() {
    private val lng: Double = 0.toDouble()
    private var brand: String? = null
    private var name: String? = null
    private var addr: String? = null
    private val acquier: String? = null
    private val terminal: String? = null
    private val photo: String? = null
    private val note: String? = null
    private val serv: List<StationService>? = null
    private var key: String? = brand
}



