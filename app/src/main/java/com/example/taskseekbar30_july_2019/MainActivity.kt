package com.example.taskseekbar30_july_2019

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var a: Button?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        alpha.max = 255
        red.max = 255
        green.max=255
        blue.max =255
        var al = 0
        var r = 0
        var g= 0
        var b = 0
        class Listen: SeekBar.OnSeekBarChangeListener
        {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                when(p0?.id)
                {
                    R.id.red -> r = p1
                    R.id.green -> g = p1
                    R.id.blue -> b = p1
                    R.id.alpha -> al = p1
                }
                a?.setBackgroundColor(Color.argb(al,r,g,b))
                
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }

        }
        var obj = Listen()
        alpha.setOnSeekBarChangeListener(obj)
        red.setOnSeekBarChangeListener(obj)
        green.setOnSeekBarChangeListener(obj)
        blue.setOnSeekBarChangeListener(obj)
    }
    fun submit(v: View)
    {
        when(v.id)
        {
            R.id.button -> a = button
            R.id.button2 -> a = button2
            R.id.button3 -> a = button3
            R.id.button4 -> a = button4
        }
    }

}
