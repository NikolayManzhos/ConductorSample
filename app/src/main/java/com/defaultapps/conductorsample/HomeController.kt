package com.defaultapps.conductorsample

import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class HomeController: BaseController() {

    private lateinit var button: Button
    private lateinit var textView: TextView
    private var value = false

    override fun provideLayout(): Int {
        return R.layout.controller_home
    }

    override fun onAttach(view: View) {
        super.onAttach(view)
        Log.d("Controller", value.toString())
        button = view.findViewById(R.id.testButton)
        textView = view.findViewById(R.id.text)

        button.setOnClickListener {
            textView.text = "hello from button"
            value = true
        }

    }
}