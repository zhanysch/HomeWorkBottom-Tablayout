package com.tablayout.BottomNav_Part2exercize.ui.forPhoneFragment

import android.icu.text.CaseMap
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class VPageAdptforPhoneB (fragment : FragmentManager):FragmentStatePagerAdapter(fragment) {

    private var list = arrayListOf<Fragment>()
    private var titles = arrayListOf<String>() // для появлен заголовка наверху

    fun addFragment(fragmen: Fragment,title :String){  // для появлен заголовка наверху
        list.add(fragmen)
        titles.add(title)
        notifyDataSetChanged()
    }

    override fun getPageTitle(position: Int)= titles[position]
        // чтоб наверху отображались название заголовок в call^
    override fun getItem(position: Int)=list[position]
    override fun getCount()=  list.size
}