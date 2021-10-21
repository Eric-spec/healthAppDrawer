package com.rickie.healthappdrawer.ui.keepfit

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.rickie.healthappdrawer.R
import com.rickie.healthappdrawer.databinding.FragmentKeepfitBinding

class KeepfitFragment : Fragment() {

    private var _binding: FragmentKeepfitBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentKeepfitBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val x: WebView = binding.webkeepfit
        x.loadUrl("file:///android_asset/keepfit.html")

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}