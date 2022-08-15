package com.bishwajeet.designpattern.creational.factorymethod.creator

import com.bishwajeet.designpattern.creational.factorymethod.product.ConcreteProductA
import com.bishwajeet.designpattern.creational.factorymethod.product.Product

class ConcreteCreatorA: Creator() {

    override fun createProduct(): Product {
        println("Product A created!")
        return ConcreteProductA()
    }
}