package com.enriqueizel.topfinances

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.enriqueizel.topfinances.databinding.ActivityTransferBinding

class TransferActivity : AppCompatActivity() {
  private lateinit var binding: ActivityTransferBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityTransferBinding.inflate(layoutInflater)
    setContentView(binding.root)
  }
}