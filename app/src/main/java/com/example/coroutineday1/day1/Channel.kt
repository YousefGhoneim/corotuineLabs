package com.example.coroutineday1.day1

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

suspend fun main()  {

    val listOfNames = listOf("hassan", "mahmoud", "Ziad", "Yousef", "Mostafa")

    runBlocking {  }

    getName().consumeEach {
        println(it)
    }




}


fun getName() = GlobalScope.produce<String> {

    val listOfNames = listOf("Kero", "Hassan", "3wida", "Ziad", "Yousef", "Mostafa")

    for (name in listOfNames){
        delay(1000)
        send(name)

    }
    close()
}