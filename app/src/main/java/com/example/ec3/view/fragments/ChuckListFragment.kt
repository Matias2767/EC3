package com.example.ec3.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.example.ec3.databinding.FragmentChuckListBinding
import com.example.ec3.view.RVChuckListAdapter

class ChuckListFragment : Fragment() {

    private lateinit var  binding: FragmentChuckListBinding
    private lateinit var  viewModel: ChuckListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(ChuckListViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentChuckListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = RVChuckListAdapter(listOf())
        binding.rvChuckList.adapter = adapter
        binding.rvChuckList.layoutManager = GridLayoutManager(requireContext(), 2, RecyclerView.VERTICAL, false)
        viewModel.chuckList.observe(requireActivity()) {
            adapter.chuck = it
            adapter.notifyDataSetChanged()
        }
        viewModel.getChuckFromService()

    }
}