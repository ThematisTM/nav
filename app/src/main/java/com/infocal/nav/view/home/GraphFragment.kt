package com.infocal.nav.view.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.infocal.nav.R
import com.infocal.nav.databinding.FragmentGraphBinding


class GraphFragment : Fragment() {
   private var _binding: FragmentGraphBinding? = null
    private val binding get() = _binding!!



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentGraphBinding.inflate(inflater,container,false)
        return binding.root

        }

}

