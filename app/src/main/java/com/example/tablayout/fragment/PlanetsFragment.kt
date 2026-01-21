package com.example.tablayout.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import com.example.tablayout.R
import com.example.tablayout.adapter.Adapter
import com.example.tablayout.databinding.FragmentPlanetsBinding
import com.example.tablayout.util.viewBinding

class PlanetsFragment : Fragment(R.layout.fragment_planets) {
    private val binding by viewBinding(FragmentPlanetsBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val divider = DividerItemDecoration(requireContext(), DividerItemDecoration.VERTICAL)
        binding.rvPlanets.addItemDecoration(divider)
        binding.rvPlanets.adapter = Adapter(
            listOf(
                "Earth",
                "Mars",
                "Jupiter",
                "Saturn",
                "Venus"
            )
        )
    }
}

