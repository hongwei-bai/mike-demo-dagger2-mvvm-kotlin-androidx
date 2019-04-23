package com.mike.daggerMvvmDemo.di.module

import com.mike.daggerMvvmDemo.viewmodel.MyViewModel
import dagger.Module
import dagger.Provides


/**
 * Author: Mike
 * Email: bhw8412@hotmail.com
 * Date: 2019/4/23
 * Description:
 */
@Module
class MainActivityModule {
    @Provides
    fun provideMyViewModel(): MyViewModel {
        return MyViewModel()
    }
}