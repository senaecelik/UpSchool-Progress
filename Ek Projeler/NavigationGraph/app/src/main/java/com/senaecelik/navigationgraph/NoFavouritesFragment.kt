package com.senaecelik.navigationgraph

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.navigation.fragment.findNavController
import com.senaecelik.navigationgraph.databinding.FragmentNoFavouritesBinding

class NoFavouritesFragment : DialogFragment() {


    private lateinit var dataBinding : FragmentNoFavouritesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        dataBinding = FragmentNoFavouritesBinding.inflate(inflater,container , false)
        return dataBinding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = findNavController()
        dataBinding.buttonGoBack.setOnClickListener {
            navController.navigate(R.id.action_noFavouritesFragment_to_noConnectionFragment)
        }
    }

}