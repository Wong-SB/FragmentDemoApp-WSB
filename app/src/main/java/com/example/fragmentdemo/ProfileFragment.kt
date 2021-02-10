package com.example.fragmentdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment


class ProfileFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_profile, container, false)

        //use view type for more general stuff
        val button  = v.findViewById<Button>(R.id.btnBack)

        button.setOnClickListener(){
           activity!!.supportFragmentManager.popBackStack()

        }


        return v
    }

}