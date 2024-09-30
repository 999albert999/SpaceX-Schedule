package com.example.spacexschedules.presentation.views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.example.spacexschedules.databinding.FragmentMainBinding
import com.example.spacexschedules.presentation.adapters.MissionItemAdapter
import com.example.spacexschedules.presentation.viewmodels.MainViewModel
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainFragment : Fragment() {
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!
    private lateinit var recyclerAdapter: MissionItemAdapter

    private val viewModel: MainViewModel by viewModel()


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentMainBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRecyclerView()

        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.viewState.collect {
                binding.currentTimeText.text = it.currentTime
                recyclerAdapter.submitList(it.missionsList)
            }
        }
    }

    private fun initRecyclerView() {
        recyclerAdapter = MissionItemAdapter()
        binding.missionsRecyclerView.adapter = recyclerAdapter
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}