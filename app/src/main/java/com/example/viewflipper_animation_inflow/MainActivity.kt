package com.example.viewflipper_animation_inflow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickNext(view: View) {
        view_flipper.showNext()
    }
    fun onClickPrevious(view: View) {
        view_flipper.showPrevious()
    }
}
