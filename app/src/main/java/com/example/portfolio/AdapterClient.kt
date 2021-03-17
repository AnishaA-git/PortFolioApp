package com.example.portfolio

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class AdapterClient(private var context: Context, private var clientModel: List<ClientModel>) : BaseAdapter() {
    override fun getCount(): Int {
        return clientModel.size
    }

    override fun getItem(position: Int): Any {
        return clientModel[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View? {
        var convertView = convertView
        val clientModelC = clientModel[position]
        val viewHolder: ViewHolder
        if (convertView == null) {
            viewHolder = ViewHolder()
            val layoutInflater = LayoutInflater.from(context)
            convertView = layoutInflater.inflate(R.layout.item_client, parent, false)
            viewHolder.clientLogo = convertView.findViewById(R.id.iv_client_logo)
            viewHolder.clientName = convertView.findViewById(R.id.txt_client_name)
            convertView.tag = viewHolder
        } else {
            viewHolder = convertView.tag as ViewHolder
        }
        Glide.with(context).load(clientModelC.clientLogo).into(viewHolder.clientLogo!!)
        viewHolder.clientName!!.text = clientModelC.clientName
        return convertView
    }

    private class ViewHolder {
        var clientLogo: ImageView? = null
        var clientName: TextView? = null
    }
}