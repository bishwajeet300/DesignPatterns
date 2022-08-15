package com.bishwajeet.designpattern.creational.factorymethod.product

class ConcreteProductA: Product {

    override fun render() {
        println("Rendering A")
    }

    override fun onClick(data: String) {
        println("Clicked A with val: $data")
    }

    override fun doStuff() {
        println("Doing stuff A")
    }
}