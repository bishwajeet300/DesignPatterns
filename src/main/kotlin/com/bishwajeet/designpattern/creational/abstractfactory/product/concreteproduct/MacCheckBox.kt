package com.bishwajeet.designpattern.creational.abstractfactory.product.concreteproduct

import com.bishwajeet.designpattern.creational.abstractfactory.product.abstractproduct.CheckBox

class MacCheckBox : CheckBox {

    private var _state = false

    override fun paint() {
        println("Painting checkbox on Mac")
    }

    override fun toggle() {
        _state = _state.not()
    }

}
