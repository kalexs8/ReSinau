package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapterSmp(
    val items: ArrayList<Fragment>,
    activity: AppCompatActivity):FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return items.size
    }

    override fun createFragment(position: Int): Fragment {
        return items[position]
    }
}