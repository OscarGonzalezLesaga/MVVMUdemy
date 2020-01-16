package com.oscar.gonzalez.lesaga.mvvmudemycourse

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.oscar.gonzalez.lesaga.mvvmudemycourse.ui.ViewModelActivity
import kotlinx.android.synthetic.main.activity_main.btViewModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initListeners()
    }

    private fun initListeners() {
        btViewModel.setOnClickListener {
            startActivity(Intent(applicationContext, ViewModelActivity::class.java))
        }
    }
}
