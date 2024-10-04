package com.example.loginmvvm_039

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {


    @JvmField
    var email = MutableLiveData<String?>()

    @JvmField
    var password = MutableLiveData<String?>()

    @JvmField
    var emailError = MutableLiveData<String?>()

    @JvmField
    val passswordError = MutableLiveData<String?>()


    private var userMutableLiveData: MutableLiveData<User>?

    init {
        // inicialice Mutable
        userMutableLiveData = MutableLiveData()
    }


    fun OnsingInClicked() {

        emailError.value = null
        passswordError.value = null


        val user = User(email.getValue(), password.getValue())

        if (email.getValue() == null || email.getValue()!!.isEmpty()) {

            emailError.value = "Enter email address"
            return

        }
        if (!user.isEmailValid) {


            passswordError.value = "Enter a valid Email Address-"
        }

        if (password.getValue() == null || password.getValue()!!.isEmpty()) {

            emailError.value = "Enter a Password"
            return

        }



        if (!user.isPasswordLenghtGreaterThan5) {
            passswordError.value = "Enter Lenght should be grather than 5"
        }




        userMutableLiveData!!.value = user


    }

   val user : LiveData<User>


       get() {

           if( userMutableLiveData == null){

               userMutableLiveData = MutableLiveData()
           }

           return userMutableLiveData!!
       }




}