package com.example.portfolio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.example.portfolio.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.navigation)
        //val navController = Navigation.findNavController(this, R.id.fragment)
        navController = Navigation.findNavController(this, R.id.fragment)

        NavigationUI.setupActionBarWithNavController(this,navController)

        NavigationUI.setupWithNavController(bottomNavigationView, navController)
    }


    override fun onSupportNavigateUp(): Boolean {
        val navController = Navigation.findNavController(this, R.id.fragment)
        return navController.navigateUp()
    }
}