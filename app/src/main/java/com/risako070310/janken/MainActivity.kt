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
            player.text = "あなたの手はグーです"
            val number = Random.nextInt(3)
            when(number){
                0 -> {
                    cpu.text = "相手の手はグーです"
                    result.text = "あいこです"
                    result.setTextColor(Color.parseColor("#8a000000"))
                }
                1 -> {
                    cpu.text = "相手の手はチョキです"
                    result.text = "あなたの勝ちです"
                    result.setTextColor(Color.parseColor("#f44336"))
                }
                2 -> {
                    cpu.text = "相手の手はパーです"
                    result.text = "あなたの負けです"
                    result.setTextColor(Color.parseColor("#2196f3"))
                }
            }
        }
        chokiButton.setOnClickListener{
            player.text = "あなたの手はチョキです"
            val number = Random.nextInt(3)
            when(number){
                0 -> {
                    cpu.text = "相手の手はグーです"
                    result.text = "あなたの負けです"
                    result.setTextColor(Color.parseColor("#2196f3"))
                }
                1 -> {
                    cpu.text = "相手の手はチョキです"
                    result.text = "あいこです"
                    result.setTextColor(Color.parseColor("#8a000000"))
                }
                2 -> {
                    cpu.text = "相手の手はパーです"
                    result.text = "あなたの勝ちです"
                    result.setTextColor(Color.parseColor("#f44336"))
                }
            }
        }
        paaButton.setOnClickListener{
            player.text = "あなたの手はパーです"
            val number = Random.nextInt(3)
            when(number){
                0 -> {
                    cpu.text = "相手の手はグーです"
                    result.text = "あなたの勝ちです"
                    result.setTextColor(Color.parseColor("#f44336"))
                }
                1 -> {
                    cpu.text = "相手の手はチョキです"
                    result.text = "あなたの負けです"
                    result.setTextColor(Color.parseColor("#2196f3"))
                }
                2 -> {
                    cpu.text = "相手の手はパーです"
                    result.text = "あいこです"
                    result.setTextColor(Color.parseColor("#8a000000"))
                }
            }
        }
    }
}