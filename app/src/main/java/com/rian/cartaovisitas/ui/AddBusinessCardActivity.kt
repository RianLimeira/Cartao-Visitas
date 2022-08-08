package com.rian.cartaovisitas.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rian.cartaovisitas.databinding.ActivityAddBusinessCardBinding


class AddBusinessCardActivity : AppCompatActivity() {

    private val binding by lazy { ActivityAddBusinessCardBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        insertListenner()
    }

    private fun insertListenner() {
        binding.btnClose.setOnClickListener {
            finish()
        }
        binding.btnConfirmar.setOnClickListener {

        }
    }
}