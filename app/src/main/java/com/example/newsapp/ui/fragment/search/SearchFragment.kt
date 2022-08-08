package com.example.newsapp.ui.fragment.search

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.newsapp.R
import com.example.newsapp.base.BaseFragment
import com.example.newsapp.databinding.FragmentSearchBinding

class SearchFragment : BaseFragment<FragmentSearchBinding>() {


    override fun inflateViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): FragmentSearchBinding {
        return FragmentSearchBinding.inflate(inflater,container,false)
    }

    override fun initListener() {

    }

    override fun initView() {

    }
}
