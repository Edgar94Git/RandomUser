package com.ereyes.randomuser.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ereyes.randomuser.domain.caseUse.GetRandomUserUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import java.lang.Exception
import javax.inject.Inject

/****
 * Project: RandomUser
 * From: com.ereyes.randomuser.presentation
 * Created by Edgar Reyes Gonzalez on 2/11/2024 at 5:27 PM
 * All rights reserved 2024.
 ****/

@HiltViewModel
class RandomUserViewModel @Inject constructor(
    private val getRandomUserUseCase: GetRandomUserUseCase
): ViewModel() {

    fun getRandomUser(){
        viewModelScope.launch {
            try {
                val result = getRandomUserUseCase()
                if(result.results.count() > 1)
                {

                }
            }
            catch (ex: Exception){

            }
            finally {

            }
        }
    }
}