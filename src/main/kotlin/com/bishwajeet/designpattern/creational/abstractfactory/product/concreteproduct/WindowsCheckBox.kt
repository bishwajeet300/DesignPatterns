package com.bishwajeet.designpattern.creational.abstractfactory.product.concreteproduct

import com.bishwajeet.designpattern.creational.abstractfactory.product.abstractproduct.CheckBox

class WindowsCheckBox : CheckBox {

    private var _state = false

    override fun paint() {
        println("Painting checkbox on Windows")
    }

    override fun toggle() {
        _state = _state.not()
    }

}
