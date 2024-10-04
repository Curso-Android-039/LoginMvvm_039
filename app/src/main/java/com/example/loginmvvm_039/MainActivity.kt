package com.example.loginmvvm_039

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.loginmvvm_039.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding:  ActivityMainBinding? = null
    private var viewModel : LoginViewModel? = null





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(LoginViewModel::class.java)


        // establecer el viewmodel en la vista de forma segura

        binding?.viewModel = viewModel
        binding?.lifecycleOwner = this




    }
}