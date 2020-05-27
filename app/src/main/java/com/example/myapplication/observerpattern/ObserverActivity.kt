package com.example.myapplication.observerpattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityObserverBinding
import dagger.android.AndroidInjection
import javax.inject.Inject

class ObserverActivity : AppCompatActivity() {

    @Inject
    lateinit var observerViewModel: ObserverViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        var databinding: ActivityObserverBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_observer)
        databinding.viewModel = observerViewModel
    }
}
