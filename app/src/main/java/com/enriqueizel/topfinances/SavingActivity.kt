package com.enriqueizel.topfinances

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.enriqueizel.topfinances.databinding.ActivitySavingBinding

class SavingActivity : AppCompatActivity() {
  private lateinit var binding: ActivitySavingBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivitySavingBinding.inflate(layoutInflater)
    setContentView(binding.root)
  }
}