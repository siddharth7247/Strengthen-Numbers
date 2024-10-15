package com.example.strengthennumbers.views.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.strengthennumbers.R
import com.example.strengthennumbers.adapters.OnBoardingFragmentAdapter

class OnBoardingScreen : AppCompatActivity() {
    lateinit var viewPager: ViewPager2
    lateinit var viewPagerAdapter : OnBoardingFragmentAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding_screen)

        viewPager = findViewById(R.id.viewPager)
        viewPagerAdapter = OnBoardingFragmentAdapter(supportFragmentManager,lifecycle)
        viewPager.adapter = viewPagerAdapter
    }
}