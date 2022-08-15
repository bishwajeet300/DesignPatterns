package com.bishwajeet.designpattern.creational.abstractfactory.product.concreteproduct

import com.bishwajeet.designpattern.creational.abstractfactory.product.abstractproduct.CheckBox

class LinuxCheckBox : CheckBox {

    private var _state = false

    override fun paint() {
        println("Painting checkbox on Linux")
    }

    override fun toggle() {
        _state = _state.not()
    }

}
