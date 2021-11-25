package com.navigationcomponenttest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.navigationcomponenttest.databinding.FragmentFourthBinding

class FourthFragment : Fragment() {

    /** Binding parameter */
    private lateinit var binding: FragmentFourthBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View {
        binding = FragmentFourthBinding.inflate(inflater, container, false)
        return binding.root
    }
}