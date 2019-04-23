package com.mike.daggerMvvmDemo.di.builder

import com.mike.daggerMvvmDemo.view.MainActivity
import com.mike.daggerMvvmDemo.di.module.MainActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector


/**
 * Author: Mike
 * Email: bhw8412@hotmail.com
 * Date: 2019/4/23
 * Description:
 */
@Module
abstract class ActivityBuilder {
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun contributeMainActivity(): MainActivity
}