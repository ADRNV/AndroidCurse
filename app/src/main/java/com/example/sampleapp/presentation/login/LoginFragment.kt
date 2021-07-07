
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.sampleapp.R
import com.example.sampleapp.databinding.FragmentLoginBinding



class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding

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
        Navigation.findNavController(binding.root).navigate(R.id.action_loginFragment_to_welcomeFragment)
    }



}