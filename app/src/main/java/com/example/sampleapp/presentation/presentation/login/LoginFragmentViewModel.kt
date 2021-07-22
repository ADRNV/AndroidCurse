package com.example.sampleapp.presentation.presentation.login

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.sampleapp.presentation.domain.LoginModel
import kotlinx.coroutines.launch

class LoginFragmentViewModel(private val loginModel:LoginModel) : ViewModel() {

    private var login = MutableLiveData<String>()
    private var password = MutableLiveData<String>()

    var status = MutableLiveData<Boolean?>()

    init {
        status.value = false
    }

    fun getAccoutdata(login:String, password: String){
        this.login.value = login
        this.password.value = password
    }

    fun validate(){
        viewModelScope.launch {
            val validation = loginModel.signIn(login.value!!, password.value!!)
            status.value = validation.signed
        }
    }

}