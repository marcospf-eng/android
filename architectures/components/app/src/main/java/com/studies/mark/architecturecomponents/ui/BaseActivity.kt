package com.studies.mark.architecturecomponents.ui

import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.View

abstract class BaseActivity : AppCompatActivity() {

    fun showSnackMessage(view: View, message: String) {
        Snackbar.make(view, message, Snackbar.LENGTH_SHORT).show()
    }

}