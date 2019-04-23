package com.mike.daggerMvvmDemo.di.module

import android.content.Context
import com.mike.daggerMvvmDemo.App
import dagger.Module
import dagger.Provides


/**
 * Author: Mike
 * Email: bhw8412@hotmail.com
 * Date: 2019/4/23
 * Description:
 */
@Module
class AppModule {
    @Provides
    fun provideContext(app: App): Context {
        return app.applicationContext
    }
}