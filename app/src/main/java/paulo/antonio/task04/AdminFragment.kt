package paulo.antonio.task04

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import paulo.antonio.task04.databinding.FragmentAcessoBinding
import paulo.antonio.task04.databinding.FragmentAdminBinding
import paulo.antonio.task04.databinding.FragmentListagemProdutosBinding

class AdminFragment : Fragment() {
    private lateinit var binding: FragmentAdminBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAdminBinding.inflate(layoutInflater, container, false)

        binding.telaProdutos.setOnClickListener {
            findNavController().navigate(R.id.action_adminFragment_to_adminProdutoFragment)
        }

        return binding.root
    }


}