package com.bishwajeet.designpattern.creational.abstractfactory.factory.concretefactory

import com.bishwajeet.designpattern.creational.abstractfactory.factory.abstractfactory.WidgetFactory
import com.bishwajeet.designpattern.creational.abstractfactory.product.abstractproduct.Button
import com.bishwajeet.designpattern.creational.abstractfactory.product.abstractproduct.CheckBox
import com.bishwajeet.designpattern.creational.abstractfactory.product.concreteproduct.WindowsButton
import com.bishwajeet.designpattern.creational.abstractfactory.product.concreteproduct.WindowsCheckBox

object WindowsWidgetFactory: WidgetFactory { // Concrete Factory

    override fun createButton(): Button {
        return WindowsButton()
    }

    override fun createCheckbox(): CheckBox {
        return WindowsCheckBox()
    }

}