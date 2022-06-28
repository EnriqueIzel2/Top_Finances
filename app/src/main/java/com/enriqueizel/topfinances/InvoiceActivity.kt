package com.enriqueizel.topfinances

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.enriqueizel.topfinances.databinding.ActivityInvoiceBinding

class InvoiceActivity : AppCompatActivity() {
  private lateinit var binding: ActivityInvoiceBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityInvoiceBinding.inflate(layoutInflater)
    setContentView(binding.root)
    supportActionBar!!.hide()

    val toolbar = binding.toolbarInvoice

    toolbar.title = "Faturas"
    toolbar.setBackgroundColor(getColor(R.color.light_blue))
    toolbar.setTitleTextColor(getColor(R.color.white))
    toolbar.setNavigationIcon(getDrawable(R.drawable.ic_arrow_back_ios_34))
    toolbar.setOnClickListener {
      finish()
    }
  }
}