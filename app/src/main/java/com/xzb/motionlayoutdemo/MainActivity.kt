package com.xzb.motionlayoutdemo

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.tv_look_motion_layout).setOnClickListener(View.OnClickListener {
            //HomeMainActivity的launchMode="singleTask"，跳转回去会先清空上面所有的activity，然后利用HomeMainActivity自身finish
            startActivity(Intent(this@MainActivity, DemoActivity::class.java))
        })
    }

}