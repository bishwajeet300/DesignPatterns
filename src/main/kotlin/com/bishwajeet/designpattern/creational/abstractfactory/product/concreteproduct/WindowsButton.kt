package com.bishwajeet.designpattern.creational.abstractfactory.product.concreteproduct

import com.bishwajeet.designpattern.creational.abstractfactory.product.abstractproduct.Button

class WindowsButton: Button {
    override fun paint() {
        println("Painting button on Windows")
    }
}