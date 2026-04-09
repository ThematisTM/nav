package com.infocal.nav.view.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.infocal.nav.R
import com.infocal.nav.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
        private var _binding: FragmentHomeBinding? = null
        private val binding get() = _binding!!



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentHomeBinding.inflate(inflater,container,false)
        val navHostFragment=childFragmentManager.findFragmentById(R.id.home_nav_host_fragment) as NavHostFragment
        val navController=navHostFragment.navController
        binding.bottomNavigation.setupWithNavController(navController)
        return binding.root

        }


}