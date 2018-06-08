package com.studies.mark.architecturecomponents.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class TestViewModel : ViewModel() {
    private var test: MutableLiveData<String> = MutableLiveData()

    fun init(initialValue: String) {
        test.value = initialValue
    }

    fun getTest() : MutableLiveData<String> {
        return test
    }
}