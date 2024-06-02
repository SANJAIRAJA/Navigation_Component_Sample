package com.example.navigation_component_sample.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigation_component_sample.R
import com.example.navigation_component_sample.databinding.FragmentMessageBinding


class MessageFragment : Fragment() {
    lateinit var binding: FragmentMessageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentMessageBinding.inflate(inflater,container,false)
        return binding.root
    }


}