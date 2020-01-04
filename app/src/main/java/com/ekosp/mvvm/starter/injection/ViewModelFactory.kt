package com.ekosp.mvvm.starter.injection

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.room.Room
import com.ekosp.mvvm.starter.model.database.AppDatabase
import com.ekosp.mvvm.starter.ui.post.PostListViewModel

/**
 * Created by Eko S. Purnomo on 1/4/2020.
 * Email me at ekosetyopurnomo@gmail.com
 * Visit me on ekosp.com
 */
class ViewModelFactory(private val activity: AppCompatActivity): ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(PostListViewModel::class.java)) {
            val db = Room.databaseBuilder(activity.applicationContext, AppDatabase::class.java, "posts").build()
            @Suppress("UNCHECKED_CAST")
            return PostListViewModel(db.postDao()) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")

    }
}