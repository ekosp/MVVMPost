package com.ekosp.mvvm.starter.model.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ekosp.mvvm.starter.model.Post
import com.ekosp.mvvm.starter.model.PostDao

/**
 * Created by Eko S. Purnomo on 1/4/2020.
 * Email me at ekosetyopurnomo@gmail.com
 * Visit me on ekosp.com
 */
@Database(entities = arrayOf(Post::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun postDao(): PostDao
}