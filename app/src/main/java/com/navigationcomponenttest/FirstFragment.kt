package com.navigationcomponenttest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.navigationcomponenttest.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    /** Binding parameter */
    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        handleButtons()
    }

    /**
     * Handles click events button.
     */
    private fun handleButtons() {
        binding.btnToFragment2.setOnClickListener {
            it.findNavController().navigate(R.id.action_first_fragment_to_second_fragment)
        }
        binding.btnToFragment4.setOnClickListener {
            it.findNavController().navigate(R.id.action_first_fragment_to_fourth_fragment)
        }
    }
}