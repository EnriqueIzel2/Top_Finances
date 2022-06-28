package com.enriqueizel.topfinances

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.enriqueizel.topfinances.databinding.ActivityBalanceBinding

class BalanceActivity : AppCompatActivity() {
  private lateinit var binding: ActivityBalanceBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityBalanceBinding.inflate(layoutInflater)
    setContentView(binding.root)
    supportActionBar!!.hide()

    val toolbar = binding.toolbarBalance

    toolbar.title = "Saldo"
    toolbar.setBackgroundColor(getColor(R.color.light_blue))
    toolbar.setTitleTextColor(getColor(R.color.white))
    toolbar.setTitleMargin(400, 0, 400, 0)

  }
}