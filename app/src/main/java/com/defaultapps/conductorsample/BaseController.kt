package com.defaultapps.conductorsample

import android.support.annotation.LayoutRes
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bluelinelabs.conductor.Controller

abstract class BaseController: Controller() {

    val TAG = "BaseController"

    @LayoutRes
    protected abstract fun provideLayout(): Int

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
        Log.i(TAG, "onCreateView")
        return inflater.inflate(provideLayout(), container, false)
    }

    override fun onAttach(view: View) {
        Log.i(TAG, "onAttach")
        super.onAttach(view)
    }

    override fun onDetach(view: View) {
        Log.i(TAG, "onDetach")
        super.onDetach(view)
    }

    override fun onDestroy() {
        Log.i(TAG, "onDestroy")
        super.onDestroy()
    }

    override fun onDestroyView(view: View) {
        Log.i(TAG, "onDestroyView")
        super.onDestroyView(view)
    }
}