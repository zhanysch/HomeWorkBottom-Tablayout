package com.tablayout.OnBoard

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter

class TabAdapter(fragmentManager: FragmentManager): FragmentStatePagerAdapter(fragmentManager) {
    private var list = arrayListOf<Fragment>()

    fun update (data : ArrayList<Fragment>){
        this.list=data
        notifyDataSetChanged()
    }


    override fun getItem(position: Int)=list[position]
    override fun getCount()=list.size


}
