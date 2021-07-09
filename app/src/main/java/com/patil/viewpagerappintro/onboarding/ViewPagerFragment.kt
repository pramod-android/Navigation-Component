package com.patil.milumart.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.adapters.AdapterViewBindingAdapter
import com.google.android.material.tabs.TabLayoutMediator
import com.patil.milumart.R
import com.patil.milumart.databinding.FragmentViewPagerBinding
import kotlinx.android.synthetic.main.fragment_view_pager.*
import kotlinx.android.synthetic.main.fragment_view_pager.view.*


class ViewPagerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

       // val binding:FragmentViewPagerBinding  = DataBindingUtil.inflate(inflater,R.layout.fragment_view_pager,container,false)
        val view = inflater.inflate(R.layout.fragment_view_pager, container, false)

        val fragmentList = arrayListOf<Fragment>(
            FirstScreenFragment(),
            SecondScreenFragment(),
            ThirdScreenFragment(),
            FourthScreenFragment()
        )

        val adapter = ViewPagerAdapter(fragmentList,requireActivity().supportFragmentManager,lifecycle)
        view.viewPager.adapter = adapter
        view.dots_indicator.setViewPager2(view.viewPager)
        return view
    }

}