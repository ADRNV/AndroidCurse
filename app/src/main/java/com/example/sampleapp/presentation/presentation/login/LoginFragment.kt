package com.example.sampleapp.presentation.presentation.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.navigation.Navigation
import com.example.sampleapp.R
import com.example.sampleapp.databinding.FragmentLoginBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

private lateinit var binding: FragmentLoginBinding

class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding
    private val loginViewModel by viewModel<LoginFragmentViewModel>()
    private var status: Boolean = false
    private lateinit var errorMessage: String

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loginViewModel.status.observe(viewLifecycleOwner, Observer { newStatus ->
            if (newStatus != null) {
                status = newStatus
            }
        })

        binding.button.setOnClickListener {
            loginViewModel.getAccoutData(binding.editTextTextPersonName.text.toString(), binding.editTextTextPassword2.text.toString())
            loginViewModel.getValidation()
            binding.editTextTextPersonName.isEnabled = false
            binding.editTextTextPassword2.isEnabled = false
            if(status) {
                onClickLoginButton()
            } else {
                Toast.makeText(context, errorMessage, Toast.LENGTH_SHORT).show()
                binding.editTextTextPersonName.isEnabled = true
                binding.editTextTextPassword2.isEnabled = true
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    private fun onClickLoginButton(){
        Navigation.findNavController(binding.root).navigate(R.id.action_loginFragment2_to_welcomeFragment2)
    }



}