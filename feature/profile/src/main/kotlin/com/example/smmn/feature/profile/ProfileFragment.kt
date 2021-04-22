package com.example.smmn.feature.profile

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.smmn.shared.model.Info
import com.example.smmn.shared.navigation.navigate
import kotlinx.android.synthetic.main.fragment_profile.*

class ProfileFragment : Fragment(R.layout.fragment_profile) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonToInfo.setOnClickListener {
            navigate(R.id.action_profileFragment_to_infoFragment, data = Info("name", "surname"))
        }
    }
}