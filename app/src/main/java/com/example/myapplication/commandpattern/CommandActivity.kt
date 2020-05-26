package com.example.myapplication.commandpattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityCommandBinding
import dagger.android.AndroidInjection
import javax.inject.Inject

class CommandActivity : AppCompatActivity() {

    @Inject
    lateinit var commandPatternViewModel: CommandPatternViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_command)
        val dataBinding: ActivityCommandBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_command)
        dataBinding.viewModel = commandPatternViewModel
    }
}
