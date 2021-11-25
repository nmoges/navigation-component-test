package com.navigationcomponenttest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.navigationcomponenttest.databinding.ActivityMainBinding

/**
 * Parent activity.
 */
class MainActivity : AppCompatActivity() {

    /** Binding parameter */
    private lateinit var binding: ActivityMainBinding

    /** Navigation controller */
    lateinit var navController: NavController

    /** Host for fragment navigation */
    private lateinit var navHostFragment: NavHostFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initializeNavigation()
    }

    /**
     * Initializes [NavController] and [NavHostFragment] objects.
     */
    private fun initializeNavigation() {
        navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment)
                as NavHostFragment
        navController = navHostFragment.navController
    }
}