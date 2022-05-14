package com.senaecelik.navigationgraph

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.senaecelik.navigationgraph.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var dataBinding : FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dataBinding = FragmentMainBinding.inflate(inflater, container, false)
        return dataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = findNavController()

        dataBinding.button.setOnClickListener {
            navController.navigate(R.id.action_mainFragment_to_noMessageFragment)
        }
    }

}