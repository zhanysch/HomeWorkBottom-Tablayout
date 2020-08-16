package com.tablayout.BottomNav_Part2exercize.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tablayout.R
import kotlinx.android.synthetic.main.activity_botto_.*

class Bottom_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_botto_)
        setupBottomNav()
        setupListener()
    }



    private fun setupBottomNav() {
        val adapter= ViewPagerAdapter(supportFragmentManager)
        viewpager.adapter=adapter
        adapter.addFragment(Fragment_Balance()) // addFragment funct from ViewpagerAdapter
        adapter.addFragment(Fragment_Phone())
        adapter.addFragment(Fragment_Home())
    }
    private fun setupListener() {
        bottomNav.setOnNavigationItemSelectedListener {
            when (it.itemId){
                R.id.balance -> viewpager.currentItem=0
                R.id.phone-> viewpager.currentItem=1
                R.id.home -> viewpager.currentItem=2

            }
            return@setOnNavigationItemSelectedListener true
        }
    }
}