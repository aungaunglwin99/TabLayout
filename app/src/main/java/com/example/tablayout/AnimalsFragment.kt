package com.example.tablayout

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tablayout.databinding.FragmentAnimalsBinding

class AnimalsFragment : Fragment(R.layout.fragment_animals) {

    private var _binding: FragmentAnimalsBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentAnimalsBinding.bind(view)

        // Sample data
        val images = listOf(
            R.drawable.tiger,
            R.drawable.tiger,
            R.drawable.tiger,
            R.drawable.tiger,
            R.drawable.tiger
        )

        val names = listOf(
            "Tiger",
            "Lion",
            "Elephant",
            "Monkey",
            "Zebra"
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
