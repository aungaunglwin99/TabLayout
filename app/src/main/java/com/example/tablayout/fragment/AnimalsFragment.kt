package com.example.tablayout.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import com.example.tablayout.R
import com.example.tablayout.adapter.Adapter
import com.example.tablayout.databinding.FragmentAnimalsBinding
import com.example.tablayout.util.viewBinding

class AnimalsFragment : Fragment(R.layout.fragment_animals) {
    private val binding by viewBinding(FragmentAnimalsBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val divider = DividerItemDecoration(requireContext(), DividerItemDecoration.VERTICAL)
        binding.rvAnimals.addItemDecoration(divider)
        binding.rvAnimals.adapter = Adapter(
            listOf(
                "Tiger",
                "Lion",
                "Elephant",
                "Monkey",
                "Zebra"
            )
        )
    }
}
