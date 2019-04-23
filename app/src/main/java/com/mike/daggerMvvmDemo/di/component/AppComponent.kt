package com.mike.daggerMvvmDemo.di.component

import com.mike.daggerMvvmDemo.App
import com.mike.daggerMvvmDemo.di.builder.ActivityBuilder
import com.mike.daggerMvvmDemo.di.module.AppModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton


/**
 * Author: Mike
 * Email: bhw8412@hotmail.com
 * Date: 2019/4/23
 * Description:
 */
@Singleton
@Component(modules = [AndroidSupportInjectionModule::class, ActivityBuilder::class, AppModule::class])
interface AppComponent : AndroidInjector<App> {
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<App>()
}