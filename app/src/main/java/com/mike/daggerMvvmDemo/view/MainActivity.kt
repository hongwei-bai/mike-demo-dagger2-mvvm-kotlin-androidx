package com.mike.daggerMvvmDemo.view

import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.mike.daggerMvvmDemo.viewmodel.MyViewModel
import com.mike.daggerMvvmDemo.R
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    protected lateinit var viewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.liveData.value = "INSTANCE of viewModel is $viewModel."

        ViewModelProviders.of(this).get(MyViewModel::class.java)

        viewModel.liveData.observe(this, Observer<String> {
            textViewHello?.text = it
        })
    }
}
