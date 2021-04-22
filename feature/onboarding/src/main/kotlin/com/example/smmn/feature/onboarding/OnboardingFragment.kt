package com.example.smmn.feature.onboarding

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.smmn.shared.navigation.navigate
import kotlinx.android.synthetic.main.fragment_onboarding.*

class OnboardingFragment : Fragment(R.layout.fragment_onboarding) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonToMain.setOnClickListener {
            navigate(R.id.action_onboardingFragment_to_mainFragment)
        }
    }
}