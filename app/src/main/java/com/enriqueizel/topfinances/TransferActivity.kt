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

    supportActionBar!!.hide()

    val toolbar = binding.toolbarTransfer

    toolbar.setBackgroundColor(getColor(R.color.light_blue))
    toolbar.title = "Transferência"
    toolbar.setTitleTextColor(getColor(R.color.white))
    toolbar.setNavigationIcon(getDrawable(R.drawable.ic_arrow_back_ios_34))
    toolbar.setOnClickListener {
      finish()
    }
  }
}