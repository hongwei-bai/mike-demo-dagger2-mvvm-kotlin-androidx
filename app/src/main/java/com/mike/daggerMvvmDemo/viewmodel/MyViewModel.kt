package com.mike.daggerMvvmDemo.viewmodel

import android.os.Handler
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


/**
 * Author: Mike
 * Email: bhw8412@hotmail.com
 * Date: 2019/4/22
 * Description:
 */
class MyViewModel : ViewModel() {
    var liveData = MutableLiveData<String>()

    var handler = Handler() {
        it?.takeIf { it.what > 0 }?.apply { liveData.value = it.what.toString() } ?: apply {
            liveData.value = "New text!"
        }
        true
    }

    init {
        Thread() {
            Thread.sleep(3000)
            for (i in 5 downTo 0) {
                Thread.sleep(1000)
                handler.sendEmptyMessage(i)
            }
        }.start()
    }
}