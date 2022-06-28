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

    supportActionBar!!.hide()
    val toolbar = binding.toolbarSaving

    toolbar.setBackgroundColor(getColor(R.color.light_blue))
    toolbar.setTitleTextColor(getColor(R.color.white))
    toolbar.title = "Poupança"
    toolbar.setNavigationIcon(getDrawable(R.drawable.ic_arrow_back_ios_34))
    toolbar.setOnClickListener {
      finish()
    }
  }
}