package com.example.smmn.feature.splash

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.smmn.shared.navigation.navigate
import kotlinx.android.synthetic.main.fragment_splash.*

class SplashFragment : Fragment(R.layout.fragment_splash) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonToOnboarding.setOnClickListener {
            navigate(R.id.action_splashFragment_to_onboardingFragment)
        }

        buttonToMain.setOnClickListener {
            navigate(R.id.action_splashFragment_to_mainFragment)
        }
    }
}