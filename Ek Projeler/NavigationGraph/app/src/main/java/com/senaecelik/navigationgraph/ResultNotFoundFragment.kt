package com.senaecelik.navigationgraph

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.senaecelik.navigationgraph.databinding.FragmentResultNotFoundBinding


class ResultNotFoundFragment : Fragment() {

    private lateinit var dataBinding: FragmentResultNotFoundBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dataBinding = FragmentResultNotFoundBinding.inflate(inflater, container, false)
        return dataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = findNavController()

        dataBinding.buttonGoBack.setOnClickListener{
            navController.navigate(R.id.action_resultNotFoundFragment_to_mainFragment)
        }
    }


}