package com.example.fragmentdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment


class WelcomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_welcome, container, false)

        //use view type for more general tuff
        val button  = v.findViewById<Button>(R.id.btnNext)

        button.setOnClickListener(){
            //do something
            val profileFg = ProfileFragment()


            // !! means cannot be null value
            activity!!.supportFragmentManager.beginTransaction().apply {
                replace(R.id.mainFg, profileFg)

                //adds the current stare to teh activity stack
                addToBackStack(null)
                commit()
            }
        }


        return v



    }


}