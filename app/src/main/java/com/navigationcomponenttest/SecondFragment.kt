package com.navigationcomponenttest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.navigationcomponenttest.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    /** Binding parameter */
    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        handleButton()
    }

    /**
     * Handles click events button.
     */
    private fun handleButton() {
        binding.btnToFragment3.setOnClickListener {
            it.findNavController().navigate(R.id.action_second_fragment_to_third_fragment)
        }
    }
}