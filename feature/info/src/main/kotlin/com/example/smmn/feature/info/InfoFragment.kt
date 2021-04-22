package com.example.smmn.feature.info

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.smmn.shared.model.Info
import com.example.smmn.shared.navigation.navigationData
import kotlinx.android.synthetic.main.fragment_info.*

class InfoFragment : Fragment(R.layout.fragment_info) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val info = navigationData as? Info ?: return
        textView.text = info.toString()
    }
}