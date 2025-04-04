package com.example.coroutineday1.day1

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map

fun getNumbers() = flow<Int> {

    for (i in 1..10){
        delay(500)
        emit(i)
    }
}


suspend fun main(){

    getNumbers()
        .filter { it > 4 }
        .map { it * 3 }
        .collect{
            println(it)
        }




}