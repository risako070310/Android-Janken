package com.risako070310.janken

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        guuButton.setOnClickListener{
            player.setImageResource(R.drawable.guu)
            val number = Random.nextInt(3)
            when(number){
                0 -> {
                    cpu.setImageResource(R.drawable.guu)
                    result.text = "あいこです"
                    result.setTextColor(Color.parseColor("#8a000000"))
                }
                1 -> {
                    cpu.setImageResource(R.drawable.choki)
                    result.text = "あなたの勝ちです"
                    result.setTextColor(Color.parseColor("#f44336"))
                }
                2 -> {
                    cpu.setImageResource(R.drawable.paa)
                    result.text = "あなたの負けです"
                    result.setTextColor(Color.parseColor("#2196f3"))
                }
            }
        }
        chokiButton.setOnClickListener{
            player.setImageResource(R.drawable.choki)
            val number = Random.nextInt(3)
            when(number){
                0 -> {
                    cpu.setImageResource(R.drawable.guu)
                    result.text = "あなたの負けです"
                    result.setTextColor(Color.parseColor("#2196f3"))
                }
                1 -> {
                    cpu.setImageResource(R.drawable.choki)
                    result.text = "あいこです"
                    result.setTextColor(Color.parseColor("#8a000000"))
                }
                2 -> {
                    cpu.setImageResource(R.drawable.paa)
                    result.text = "あなたの勝ちです"
                    result.setTextColor(Color.parseColor("#f44336"))
                }
            }
        }
        paaButton.setOnClickListener{
            player.setImageResource(R.drawable.paa)
            val number = Random.nextInt(3)
            when(number){
                0 -> {
                    cpu.setImageResource(R.drawable.guu)
                    result.text = "あなたの勝ちです"
                    result.setTextColor(Color.parseColor("#f44336"))
                }
                1 -> {
                    cpu.setImageResource(R.drawable.choki)
                    result.text = "あなたの負けです"
                    result.setTextColor(Color.parseColor("#2196f3"))
                }
                2 -> {
                    cpu.setImageResource(R.drawable.paa)
                    result.text = "あいこです"
                    result.setTextColor(Color.parseColor("#8a000000"))
                }
            }
        }
    }
}