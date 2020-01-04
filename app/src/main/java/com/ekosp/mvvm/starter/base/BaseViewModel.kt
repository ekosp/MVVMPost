package com.ekosp.mvvm.starter.base

import androidx.lifecycle.ViewModel
import com.ekosp.mvvm.starter.injection.component.DaggerViewModelInjector
import com.ekosp.mvvm.starter.injection.component.ViewModelInjector
import com.ekosp.mvvm.starter.injection.module.NetworkModule
import com.ekosp.mvvm.starter.ui.post.PostListViewModel

/**
 * Created by Eko S. Purnomo on 1/4/2020.
 * Email me at ekosetyopurnomo@gmail.com
 * Visit me on ekosp.com
 */
abstract class BaseViewModel:ViewModel(){
    private val injector: ViewModelInjector = DaggerViewModelInjector
        .builder()
        .networkModule(NetworkModule)
        .build()

    init {
        inject()
    }

    /**
     * Injects the required dependencies
     */
    private fun inject() {
        when (this) {
            is PostListViewModel -> injector.inject(this)
        }
    }
}