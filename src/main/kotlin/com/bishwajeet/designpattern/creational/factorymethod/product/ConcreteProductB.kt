package com.bishwajeet.designpattern.creational.factorymethod.product

class ConcreteProductB: Product {

    override fun render() {
        println("Rendering B")
    }

    override fun onClick(data: String) {
        println("Clicked B with val: $data")
    }

    override fun doStuff() {
        println("Doing stuff ")
    }
}