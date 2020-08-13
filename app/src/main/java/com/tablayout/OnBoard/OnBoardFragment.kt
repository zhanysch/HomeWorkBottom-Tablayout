package com.tablayout.OnBoard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.tablayout.R
import com.tablayout.data.DataClass
import kotlinx.android.synthetic.main.fragment_onboard.*

class OnBoardFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_onboard, container, false)
       }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupviews()
    }

    private fun setupviews() {
        val data = arguments?.get(DATA_ID) as DataClass
        tvt2.text=data.textTwo
        tvt1.text = data.textOne
        image.setImageResource(data.image)
    }

    companion object{
        const val DATA_ID = "DATA_ID"

        fun getInstance(data : DataClass ): OnBoardFragment {
            val fragment = OnBoardFragment()
            val bundle = Bundle()
            bundle.putParcelable (DATA_ID, data)
            fragment.arguments = bundle
            return fragment
        }
    }
}