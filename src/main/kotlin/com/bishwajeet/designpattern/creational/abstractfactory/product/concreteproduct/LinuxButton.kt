package com.bishwajeet.designpattern.creational.abstractfactory.product.concreteproduct

import com.bishwajeet.designpattern.creational.abstractfactory.product.abstractproduct.Button

class LinuxButton: Button {
    override fun paint() {
        println("Painting button on Linux")
    }
}