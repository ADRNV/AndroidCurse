package com.example.sampleapp.presentation.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentContainerView
import androidx.navigation.Navigation
import com.example.sampleapp.R
import com.example.sampleapp.databinding.FragmentLoginBinding

private lateinit var binding: FragmentLoginBinding

class LoginFragment : Fragment() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        binding.button.setOnClickListener { onClickLoginButton() }
        return binding.root
    }

    private fun onClickLoginButton(){
        Navigation.findNavController(binding.root).navigate(R.id.action_loginFragment2_to_welcomeFragment2)
    }



}