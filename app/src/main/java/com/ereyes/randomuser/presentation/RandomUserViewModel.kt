package com.ereyes.randomuser.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ereyes.randomuser.core.Constants
import com.ereyes.randomuser.domain.caseUse.GetRandomUserUseCase
import com.ereyes.randomuser.domain.model.RandomUserModel
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

    private val _result: MutableLiveData<RandomUserModel> = MutableLiveData<RandomUserModel>()
    val result: LiveData<RandomUserModel> = _result

    private val _message: MutableLiveData<String> = MutableLiveData<String>()
    val message: LiveData<String> = _message

    private val _isLoaded: MutableLiveData<Boolean> = MutableLiveData<Boolean>()
    val isLoaded: LiveData<Boolean> = _isLoaded

    fun getRandomUser(){
        viewModelScope.launch {
            _isLoaded.value = Constants.SHOW
            try {
                val result = getRandomUserUseCase()

                if(result.results.isEmpty())
                    _message.value = "No se obtuvo usuario random"
                else
                    _result.value = result
            }
            catch (ex: Exception){
                _message.value = ex.message
            }
            finally {
                _isLoaded.value = Constants.HIDE
            }
        }
    }
}