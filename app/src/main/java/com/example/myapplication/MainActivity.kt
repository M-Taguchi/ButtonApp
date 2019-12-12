package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // タップ数を格納する変数
    var count: Int = 0
    // textViewのインスタンスを格納する変数
    var countText: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // idからTextViewのオブジェクトを取得
        countText = this.findViewById(R.id.count)
        countText!!.text = count.toString()

        // idからButonのオブジェクトを取得
        val btn: Button = this.findViewById(R.id.btn)
        // ボタンからタップを検知
        btn.setOnClickListener{
            count += 1
            countText!!.text = count.toString()
        }
    }
}
