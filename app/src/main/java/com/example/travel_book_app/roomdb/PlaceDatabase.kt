package com.example.travel_book_app.roomdb

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.travel_book_app.model.Place

@Database(entities = [Place::class], version = 1)
abstract class PlaceDatabase : RoomDatabase() {
    abstract fun placeDao(): PlaceDao
}
