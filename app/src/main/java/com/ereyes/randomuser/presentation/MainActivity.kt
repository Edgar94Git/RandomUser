package com.ereyes.randomuser.presentation

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import com.bumptech.glide.request.RequestOptions
import com.ereyes.randomuser.databinding.ActivityMainBinding
import com.ereyes.randomuser.domain.model.RandomUserModel
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel by viewModels<RandomUserViewModel>()
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpObserves()
        setUpButtoms()
        viewModel.getRandomUser()
    }

    private fun setUpButtoms() {
        binding.btnRandomUser.setOnClickListener {
            viewModel.getRandomUser()
        }
    }

    private fun setUpObserves() {
        viewModel.result.observe(this){result ->
            loadInformationUser(result)
        }
        viewModel.message.observe(this){msg ->
            Snackbar.make(binding.root, msg, Snackbar.LENGTH_LONG).show()
        }
        viewModel.isLoaded.observe(this){isLoaded ->
            binding.pbRandomUser.isVisible = isLoaded
        }
        var prueba: Int
    }

    private fun loadInformationUser(result: RandomUserModel){
        Glide.with(this)
            .asBitmap()
            .load(result.results[0].picture.medium)
            .apply(RequestOptions.bitmapTransform(CircleCrop()))
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .into(binding.ivPicture)

        binding.tvName.text = result.results[0].name.getNameComplete()
    }

}