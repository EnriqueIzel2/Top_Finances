package com.enriqueizel.topfinances

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.enriqueizel.topfinances.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
  private lateinit var binding: ActivityMainBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

    binding.imgBalance.setOnClickListener {
      val intent = Intent(this, BalanceActivity::class.java)
      startActivity(intent)
    }

    binding.imgInvoice.setOnClickListener {
      val intent = Intent(this, InvoiceActivity::class.java)
      startActivity(intent)
    }
  }
}