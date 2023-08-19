package com.example.newlesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import com.airbnb.lottie.LottieAnimationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        val laAnimation=findViewById<LottieAnimationView>(R.id.la_loading)
        val ivImage=findViewById<ImageView>(R.id.iv_image)
        val b_zoom=findViewById<Button>(R.id.b_zoom)
        val b_blink=findViewById<Button>(R.id.b_blink)
        val b_fade=findViewById<Button>(R.id.b_fade)
        val b_rotate=findViewById<Button>(R.id.b_rotate)
        val b_move=findViewById<Button>(R.id.b_move)
        val b_slide=findViewById<Button>(R.id.b_slide)

        b_zoom.setOnClickListener {
            val zoonIn=AnimationUtils.loadAnimation(this,R.anim.zoom_in)
            ivImage.startAnimation(zoonIn)
        }
        b_rotate.setOnClickListener {
            val rotateIn=AnimationUtils.loadAnimation(this,R.anim.rotate_in)
            ivImage.startAnimation(rotateIn)
        }
        b_fade.setOnClickListener {
            val fadeIn=AnimationUtils.loadAnimation(this,R.anim.fade_in)
            ivImage.startAnimation(fadeIn)
        }
        b_blink.setOnClickListener {
            val blinkIn=AnimationUtils.loadAnimation(this,R.anim.blink_in)
            ivImage.startAnimation(blinkIn)
        }
        b_move.setOnClickListener {
            val moveIn=AnimationUtils.loadAnimation(this,R.anim.move_in)
            ivImage.startAnimation(moveIn)
        }
        b_slide.setOnClickListener {
            val slideIn=AnimationUtils.loadAnimation(this,R.anim.side_in)
            ivImage.startAnimation(slideIn)
        }
        b_move.setOnClickListener {
            laAnimation.setAnimation("batterfly.json")
            laAnimation.playAnimation()
        }
        b_rotate.setOnClickListener {
            laAnimation.setAnimation("loading.json")
            laAnimation.playAnimation()
        }
        b_slide.setOnClickListener {
            laAnimation.setAnimation("human.json")
            laAnimation.playAnimation()
        }
        b_zoom.setOnClickListener {
            laAnimation.setAnimation("plant.json")
            laAnimation.playAnimation()
        }
    }
}