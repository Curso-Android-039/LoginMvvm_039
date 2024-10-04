package com.example.loginmvvm_039

import android.util.Patterns
import java.util.regex.Pattern

// user Model la lògica del negocio

class User( private val email : String?, private val password : String?) {

    fun getEmail() : String{

        return  email ?: ""
    }


    fun getpassword() : String{

        return  email ?: ""
    }




     val isEmailValid :Boolean
         get() = Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches()


     val isPasswordLenghtGreaterThan5 : Boolean
         get() = getpassword().length > 5





}