package com.example.portfolio.fragments

import android.os.Bundle
import android.view.*
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.portfolio.R
import com.example.portfolio.databinding.FragmentHomeBinding

/**
 * A simple [Fragment] subclass.
 * create an instance of this fragment.
 */
class FragmentHome : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_home, container, false)
        //val textView = findViewById<TextView>(R.id.txt_projects)

        val binding = DataBindingUtil.inflate<FragmentHomeBinding>(inflater,
            R.layout.fragment_home,container,false)

        binding.Project.setOnClickListener { view: View ->
            //view.findNavController().navigate(R.id.action_titleFragment_to_questionFragment)
            Navigation.findNavController(view).navigate(R.id.action_fragmentHome_to_fragmentProjects)

        }
        binding.Contact.setOnClickListener { view: View ->
            //view.findNavController().navigate(R.id.action_titleFragment_to_questionFragment)
            Navigation.findNavController(view).navigate(R.id.action_fragmentHome_to_fragmentContact)

        }

        //setHasOptionsMenu(true)
        return binding.root
    }

}