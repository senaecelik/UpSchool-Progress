package com.senaecelik.navigationgraph

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.senaecelik.navigationgraph.databinding.FragmentNoMessageBinding


class NoMessageFragment : DialogFragment() {

    private lateinit var dataBinding : FragmentNoMessageBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
         dataBinding = FragmentNoMessageBinding.inflate(inflater, container, false);

        dataBinding.buttonGoBack.setOnClickListener {
            findNavController().navigate(R.id.action_noMessageFragment_to_noFavouritesFragment)
        }

        return dataBinding.root;

    }

}