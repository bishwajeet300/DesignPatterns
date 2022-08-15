package com.bishwajeet.designpattern.creational.factorymethod.creator

import com.bishwajeet.designpattern.creational.factorymethod.product.Product

abstract class Creator {

    abstract fun createProduct(): Product

    fun render() {
        val product = createProduct()
        product.doStuff()
        product.render()
        product.onClick("CLICK")
    }
}