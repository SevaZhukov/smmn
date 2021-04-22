package com.example.smmn.feature.settings

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.smmn.shared.navigation.navigate
import kotlinx.android.synthetic.main.fragment_settings.*

class SettingsFragment : Fragment(R.layout.fragment_settings) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonToSplash.setOnClickListener {
            navigate(R.id.action_mainFragment_to_splashFragment, R.id.host_global)
        }
    }
}