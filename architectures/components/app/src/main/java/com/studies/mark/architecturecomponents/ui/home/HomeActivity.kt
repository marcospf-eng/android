package com.studies.mark.architecturecomponents.ui.home

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import com.studies.mark.architecturecomponents.R
import com.studies.mark.architecturecomponents.ui.BaseActivity
import com.studies.mark.architecturecomponents.viewmodel.TestViewModel
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : BaseActivity() {

    private lateinit var testViewModel: TestViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    override fun onStart() {
        super.onStart()

        initListeners()
        initObservers()
    }

    private fun initListeners() {
        changeTextButton.setOnClickListener {
            testViewModel.getTest().value = getString(R.string.new_value)
        }
    }

    private fun initObservers() {
        testViewModel = ViewModelProviders.of(this).get(TestViewModel::class.java)
        testViewModel.init(getString(R.string.old_value))

        val observer: Observer<String> =  Observer {
            textTest.text = it
        }

        testViewModel.getTest().observe(this, observer)
        showSnackMessage(activityHome, getString(R.string.screen_has_been_loaded))
    }

}
