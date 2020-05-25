package com.example.myapplication.factorypattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityFactoryBinding
import dagger.android.AndroidInjection
import javax.inject.Inject

class FactoryActivity : AppCompatActivity() {

    @Inject
    lateinit var factoryViewModel: FactoryViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        var dataBinding: ActivityFactoryBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_factory)
        dataBinding.viewModel = factoryViewModel
    }
}
