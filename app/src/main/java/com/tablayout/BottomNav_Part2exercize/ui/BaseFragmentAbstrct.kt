package com.tablayout.BottomNav_Part2exercize.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.tablayout.R

abstract class BaseFragmentAbstrct : Fragment () {
    protected abstract fun resId(): Int
 // заметка для себя абстрактн метод создан для того чтобы нижн функцию не прописывать каждый раз
    // в каждый фрагмент___
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(resId(), container, false)
        return view
    }
}