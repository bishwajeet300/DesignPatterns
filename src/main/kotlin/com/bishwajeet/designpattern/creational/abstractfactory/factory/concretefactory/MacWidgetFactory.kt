package com.bishwajeet.designpattern.creational.abstractfactory.factory.concretefactory

import com.bishwajeet.designpattern.creational.abstractfactory.factory.abstractfactory.WidgetFactory
import com.bishwajeet.designpattern.creational.abstractfactory.product.abstractproduct.Button
import com.bishwajeet.designpattern.creational.abstractfactory.product.abstractproduct.CheckBox
import com.bishwajeet.designpattern.creational.abstractfactory.product.concreteproduct.MacButton
import com.bishwajeet.designpattern.creational.abstractfactory.product.concreteproduct.MacCheckBox

object MacWidgetFactory: WidgetFactory { // Concrete Factory

    override fun createButton(): Button {
        return MacButton()
    }

    override fun createCheckbox(): CheckBox {
        return MacCheckBox()
    }

}