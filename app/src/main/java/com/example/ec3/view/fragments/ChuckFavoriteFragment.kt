package com.example.ec3.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ec3.R
import com.example.ec3.databinding.FragmentChuckFavoriteBinding


class ChuckFavoriteFragment : Fragment() {

    private lateinit var binding:FragmentChuckFavoriteBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentChuckFavoriteBinding.inflate(inflater, container, false)
        return binding.root
    }
}