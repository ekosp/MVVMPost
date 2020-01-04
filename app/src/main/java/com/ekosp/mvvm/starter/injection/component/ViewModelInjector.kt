package com.ekosp.mvvm.starter.injection.component

import androidx.lifecycle.ViewModel
import com.ekosp.mvvm.starter.injection.module.NetworkModule
import com.ekosp.mvvm.starter.ui.post.PostListViewModel
import com.ekosp.mvvm.starter.ui.post.PostViewModel
import dagger.Component
import javax.inject.Singleton

/**
 * Created by Eko S. Purnomo on 1/4/2020.
 * Email me at ekosetyopurnomo@gmail.com
 * Visit me on ekosp.com
 */


/**
 * Component providing inject() methods for presenters.
 */
@Singleton
@Component(modules = [(NetworkModule::class)])
interface ViewModelInjector {
    /**
     * Injects required dependencies into the specified PostListViewModel.
     * @param postListViewModel PostListViewModel in which to inject the dependencies
     */
    fun inject(postListViewModel: PostListViewModel)
    /**
     * Injects required dependencies into the specified PostViewModel.
     * @param postViewModel PostViewModel in which to inject the dependencies
     */
    fun inject(postViewModel: PostViewModel)

    @Component.Builder
    interface Builder {
        fun build(): ViewModelInjector

        fun networkModule(networkModule: NetworkModule): Builder
    }
}