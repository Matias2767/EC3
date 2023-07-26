package com.example.ec3.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ec3.R
import com.example.ec3.databinding.FragmentChuckDetailBinding


class ChuckDetailFragment : Fragment() {

    private lateinit var binding: FragmentChuckDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentChuckDetailBinding.inflate(inflater, container, false)
        return binding.root
    }


}