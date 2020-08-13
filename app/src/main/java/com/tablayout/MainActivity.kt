package com.tablayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.tablayout.OnBoard.OnBoardFragment
import com.tablayout.OnBoard.TabAdapter
import com.tablayout.data.DataClass
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val list = arrayListOf<Fragment>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupViewPager()
        setupListener()
    }

    private fun setupListener() {
        OnviewPage.setOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {
            }

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {}


            override fun onPageSelected(position: Int) {
                if (checktopage(position)) {
                    Btngo.text = "Pass to next Page"         // функция для кнопки NExt & Finish
                } else {
                    Btngo.text = "Next"
                }
            }
        })
        Btngo.setOnClickListener {
            if (checktopage(OnviewPage.currentItem)) {
                startActivity(Intent(this, Bottom_Activity::class.java))  //
                finish()
            } else {
                OnviewPage.currentItem += 1
            }
        }
    }

    private fun checktopage(position: Int) = position == list.size - 1


    private fun setupViewPager() {
        val adapter = TabAdapter(supportFragmentManager)
        OnviewPage.adapter = adapter

        list.add(OnBoardFragment.getInstance(DataClass(R.drawable.image_ic, "", "japan")))
        list.add(OnBoardFragment.getInstance(DataClass(R.drawable.sary_chelek, "", "kyrgyzstan")))
        list.add(OnBoardFragment.getInstance(DataClass(R.drawable.ic_norw, "", "norway")))
        list.add(OnBoardFragment.getInstance(DataClass(R.drawable.home_down, "", "unknown")))
        adapter.update(list)
        OnTabLT.setupWithViewPager(OnviewPage)
    }
}