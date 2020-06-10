package com.example.myapplication.decoretorpatten

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityDecoratorBinding
import dagger.android.AndroidInjection
import javax.inject.Inject

class DecoratorActivity : AppCompatActivity() {

    @Inject
    lateinit var decoratorBinding: DecoratorPatternViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        val dataBinding: ActivityDecoratorBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_decorator)
        dataBinding.viewmodel = decoratorBinding
    }
}