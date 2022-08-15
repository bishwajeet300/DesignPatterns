package com.bishwajeet.designpattern.creational.factorymethod.creator

import com.bishwajeet.designpattern.creational.factorymethod.product.ConcreteProductB
import com.bishwajeet.designpattern.creational.factorymethod.product.Product

class ConcreteCreatorB: Creator() {

    override fun createProduct(): Product {
        println("Product B created!")
        return ConcreteProductB()
    }
}