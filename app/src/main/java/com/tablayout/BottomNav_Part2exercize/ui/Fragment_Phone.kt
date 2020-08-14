package com.tablayout.BottomNav_Part2exercize.ui

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.tablayout.BottomNav_Part2exercize.ui.BaseFragmentAbstrct
import com.tablayout.BottomNav_Part2exercize.ui.forPhoneFragment.Fragment_PhoneFirst
import com.tablayout.BottomNav_Part2exercize.ui.forPhoneFragment.Fragment_PhoneSecond
import com.tablayout.BottomNav_Part2exercize.ui.forPhoneFragment.VPageAdptforPhoneB
import com.tablayout.R
import kotlinx.android.synthetic.main.fragment_phone.*

class Fragment_Phone :  BaseFragmentAbstrct()  {
    override fun resId()= R.layout.fragment_phone

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViewPAge()
    }

    private fun setupViewPAge() {
        val adapter = VPageAdptforPhoneB(childFragmentManager)
        VPage.adapter=adapter
        adapter.addFragment(Fragment_PhoneSecond(), "Chate")
        adapter.addFragment(Fragment_PhoneFirst(), "Contacts")
        TabLoy.setupWithViewPager(VPage)
    }
}