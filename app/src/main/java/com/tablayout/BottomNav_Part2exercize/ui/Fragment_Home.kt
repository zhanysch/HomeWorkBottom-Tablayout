package com.tablayout.BottomNav_Part2exercize.ui

import android.os.Bundle
import android.view.View
import com.tablayout.BottomNav_Part2exercize.App
import com.tablayout.BottomNav_Part2exercize.data.AbstDao
import com.tablayout.BottomNav_Part2exercize.data.DataModel
import com.tablayout.BottomNav_Part2exercize.ui.BaseFragmentAbstrct
import com.tablayout.R
import kotlinx.android.synthetic.main.fragment_home.*

class Fragment_Home : BaseFragmentAbstrct() {
    override fun resId()= R.layout.fragment_home

    private var db: AbstDao?=null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        db= App.app?.getDb()?.getDataModel()
        setuplistener()
    }

    private fun setuplistener() {
        btnSave.setOnClickListener {
           db?.save(DataModel(
               title = EdOne.text.toString(),
               id = 0
           ))
        }
    }
}