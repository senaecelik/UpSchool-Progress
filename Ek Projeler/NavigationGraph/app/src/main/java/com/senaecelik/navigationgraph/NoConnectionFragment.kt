package com.senaecelik.navigationgraph

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.senaecelik.navigationgraph.databinding.FragmentNoConnectionBinding


class NoConnectionFragment : Fragment() {

    private lateinit var binding: FragmentNoConnectionBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNoConnectionBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = findNavController()
        binding.buttonNoConnect.setOnClickListener{
            navController.navigate(R.id.action_noConnectionFragment_to_resultNotFoundFragment)
        }
    }


}