package com.mike.daggerMvvmDemo

import com.mike.daggerMvvmDemo.di.component.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication


/**
 * Author: Mike
 * Email: bhw8412@hotmail.com
 * Date: 2019/4/22
 * Description:
 */
class App : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().create(this)
    }
}