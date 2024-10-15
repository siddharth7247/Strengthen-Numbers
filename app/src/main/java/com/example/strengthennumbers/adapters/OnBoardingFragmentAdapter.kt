package com.example.strengthennumbers.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.strengthennumbers.views.fragments.OnBoarding1Fragment

class OnBoardingFragmentAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle):FragmentStateAdapter(fragmentManager,lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> OnBoarding1Fragment()
            1 -> OnBoarding1Fragment()
            2 -> OnBoarding1Fragment()
            else -> OnBoarding1Fragment()
        }
    }
}