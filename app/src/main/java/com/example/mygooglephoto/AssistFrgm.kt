package com.example.mygooglephoto

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class AssistFrgm : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater?,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater!!.inflate(R.layout.assistant, container,false)
    }
}