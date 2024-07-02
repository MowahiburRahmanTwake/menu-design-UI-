package com.example.uidesignproject

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.uidesignproject.databinding.ActivityRegistrationBinding

class MainActivity : AppCompatActivity()
{
    private lateinit var binding : ActivityRegistrationBinding
    override fun onCreate(savedInstanceState : Bundle?)
    {

        super.onCreate(savedInstanceState)
        var binding = ActivityRegistrationBinding.inflate(layoutInflater)
//        setContentView(R.layout.activity_main)
//        setContentView(R.layout.activity_registration)
        setContentView(R.layout.activity_article)
//        setContentView(binding.root)
//
//        binding.checkBoxAgree.addOnCheckedStateChangedListener { checkBox, state ->
//            if (checkBox.isChecked ){
//                checkBox.text = "You are agree"
//            }else{
//                checkBox.text = "I agree"
//            }
//        }
    }
}