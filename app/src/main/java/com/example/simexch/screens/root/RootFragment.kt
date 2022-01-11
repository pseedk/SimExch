package com.example.simexch.screens.root

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import com.example.simexch.R
import com.example.simexch.ViewPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.fragment_root.view.*

class RootFragment : Fragment() {

    private var ctx: Context? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        ctx = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_root, container, false)
        view.tab_layout.tabIconTint = null
        view.viewPager.adapter = ViewPagerAdapter(ctx as FragmentActivity)
        TabLayoutMediator(view.tab_layout, view.viewPager) {
            tab, pos ->
            when(pos) {
                0 -> {
                    tab.setIcon(R.drawable.ic_baseline_monetization_on_24)
                }
                1 -> {
                    tab.setIcon(R.drawable.ic_baseline_attach_money_24)
                }
            }
        }.attach()
        return view
    }

}