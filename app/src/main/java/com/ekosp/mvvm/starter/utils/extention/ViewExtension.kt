package com.ekosp.mvvm.starter.utils.extention

import android.content.ContextWrapper
import android.view.View
import androidx.appcompat.app.AppCompatActivity

/**
 * Created by Eko S. Purnomo on 1/4/2020.
 * Email me at ekosetyopurnomo@gmail.com
 * Visit me on ekosp.com
 */
fun View.getParentActivity(): AppCompatActivity?{
    var context = this.context
    while (context is ContextWrapper) {
        if (context is AppCompatActivity) {
            return context
        }
        context = context.baseContext
    }
    return null
}