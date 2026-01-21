package com.example.tablayout.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import com.example.tablayout.R
import com.example.tablayout.adapter.Adapter
import com.example.tablayout.databinding.FragmentPlantsBinding
import com.example.tablayout.util.viewBinding

class PlantsFragment : Fragment(R.layout.fragment_plants) {
    private val binding by viewBinding(FragmentPlantsBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val divider = DividerItemDecoration(requireContext(), DividerItemDecoration.VERTICAL)
        binding.rvPlants.addItemDecoration(divider)
        binding.rvPlants.adapter = Adapter(
            listOf(
                "Rose",
                "Tulip",
                "Sunflower",
                "Rose",
                "Tulip",
                "Sunflower"
            )
        )
    }
}
