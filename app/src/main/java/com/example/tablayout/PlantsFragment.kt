package com.example.tablayout

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tablayout.databinding.FragmentPlantsBinding

class PlantsFragment : Fragment(R.layout.fragment_plants) {

    private var _binding: FragmentPlantsBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentPlantsBinding.bind(view)

        // Sample data
        val images = listOf(
            R.drawable.tiger,
            R.drawable.tiger,
            R.drawable.tiger,
            R.drawable.tiger,
            R.drawable.tiger,
            R.drawable.tiger
        )

        val names = listOf(
            "Rose",
            "Tulip",
            "Sunflower",
            "Rose",
            "Tulip",
            "Sunflower"
        )

        val adapter = Adapter(images, names)

        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerView.adapter = adapter

        val divider = DividerItemDecoration(requireContext(), DividerItemDecoration.VERTICAL)
        binding.recyclerView.addItemDecoration(divider)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
