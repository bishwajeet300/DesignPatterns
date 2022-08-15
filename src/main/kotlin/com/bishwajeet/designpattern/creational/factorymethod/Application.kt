package com.bishwajeet.designpattern.creational.factorymethod

import com.bishwajeet.designpattern.creational.factorymethod.creator.ConcreteCreatorA
import com.bishwajeet.designpattern.creational.factorymethod.creator.ConcreteCreatorB
import com.bishwajeet.designpattern.creational.factorymethod.creator.Creator

class Application {

    lateinit var creator : Creator

    fun initialize(config: String) {
        creator = when (config) {
            "A" -> {
                ConcreteCreatorA()
            }
            "B" -> {
                ConcreteCreatorB()
            }
            else -> {
                throw Exception("creator not found")
            }
        }
    }
}



/********************************    MAIN   ***********************************/
fun main() {

    val factoryApplication = Application()
    factoryApplication.initialize("B")
    factoryApplication.creator.render()
}