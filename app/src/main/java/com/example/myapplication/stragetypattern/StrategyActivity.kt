package com.example.myapplication.stragetypattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityStrategyBinding
import dagger.android.AndroidInjection
import javax.inject.Inject

class StrategyActivity : AppCompatActivity() {

    @Inject
    lateinit var strategyViewModel: StrategyViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)
        val dataBinding: ActivityStrategyBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_strategy)

        dataBinding.viewModle = strategyViewModel
    }
}
