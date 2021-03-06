package com.androdevlinux.percy.stackingsats.ui.wallet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.androdevlinux.percy.stackingsats.R
import com.androdevlinux.percy.stackingsats.base.BaseFragment
import com.androdevlinux.percy.stackingsats.utils.AppPreferenceManager
import com.ncorti.slidetoact.SlideToActView
import kotlinx.android.synthetic.main.fragment_wallet.*

class WalletFragment : BaseFragment() {

    private lateinit var appPreferenceManager: AppPreferenceManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        appPreferenceManager = AppPreferenceManager(requireContext())
        (context as AppCompatActivity).supportActionBar!!.title = requireContext().getString(R.string.title_wallet)
    }

    override fun onResume() {
        super.onResume()
        (context as AppCompatActivity).supportActionBar!!.title = requireContext().getString(R.string.title_wallet)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_wallet, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        btnSaveChanges.onSlideCompleteListener = object : SlideToActView.OnSlideCompleteListener {
            override fun onSlideComplete(view: SlideToActView) {
                btnSaveChanges.resetSlider()
            }
        }
    }
}