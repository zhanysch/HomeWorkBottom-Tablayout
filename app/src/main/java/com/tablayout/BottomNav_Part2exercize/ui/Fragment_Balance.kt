package com.tablayout.BottomNav_Part2exercize.ui


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.tablayout.BottomNav_Part2exercize.App
import com.tablayout.BottomNav_Part2exercize.data.AbstDao
import com.tablayout.BottomNav_Part2exercize.ui.BaseFragmentAbstrct
import com.tablayout.R
import kotlinx.android.synthetic.main.fragment_balacne.*

class Fragment_Balance : BaseFragmentAbstrct() {
    override fun resId() = R.layout.fragment_balacne
    private var db: AbstDao? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        db = App.app?.getDb()?.getDataModel()

        recycler()
    }

    private fun recycler() {
        val adapter = RecycAdapter()
        val data = db?.getdatalive()
        reclerview.adapter = adapter
        data?.observe(viewLifecycleOwner, Observer {  // auto putting Data
            adapter.update(it)
        })
    }
}