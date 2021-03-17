package com.example.portfolio.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import androidx.fragment.app.Fragment
import com.example.portfolio.AdapterClient
import com.example.portfolio.ClientModel
import com.example.portfolio.R
import java.util.*

/**
 * A simple [Fragment] subclass.
 * create an instance of this fragment.
 */
class FragmentProjects : Fragment() {
    var clientModel: MutableList<ClientModel>? = null
    var gridView: GridView? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_projects, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        gridView = view.findViewById(R.id.gridView)
        clientModel = ArrayList()
        val clientModel = clientModel;
        val gridView = gridView;
        if (clientModel != null) {
            clientModel.add(ClientModel("Amazon", R.drawable.amazon))
            clientModel.add(ClientModel("Apple", R.drawable.apple))
            clientModel.add(ClientModel("Bitcoin", R.drawable.bitcoin))
            clientModel.add(ClientModel("Cpanel", R.drawable.cpanel))
            clientModel.add(ClientModel("Firefox", R.drawable.firefox))
            clientModel.add(ClientModel("Google", R.drawable.google))
            clientModel.add(ClientModel("PayPal", R.drawable.paypal))
            clientModel.add(ClientModel("PInterest", R.drawable.pinterest))
            clientModel.add(ClientModel("Twitter", R.drawable.twitter))
            clientModel.add(ClientModel("Whatsapp", R.drawable.whatsapp))
            clientModel.add(ClientModel("Microsoft", R.drawable.microsoft))
            clientModel.add(ClientModel("Wordpress", R.drawable.wordpress))
            val adapterClient = AdapterClient(requireContext(), clientModel)
            if (gridView != null) {
                gridView.adapter = adapterClient
            }
        }



    }
}