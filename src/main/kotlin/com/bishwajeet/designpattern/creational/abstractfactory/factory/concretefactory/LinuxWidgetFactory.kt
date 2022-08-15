package com.bishwajeet.designpattern.creational.abstractfactory.factory.concretefactory

import com.bishwajeet.designpattern.creational.abstractfactory.factory.abstractfactory.WidgetFactory
import com.bishwajeet.designpattern.creational.abstractfactory.product.abstractproduct.Button
import com.bishwajeet.designpattern.creational.abstractfactory.product.abstractproduct.CheckBox
import com.bishwajeet.designpattern.creational.abstractfactory.product.concreteproduct.LinuxButton
import com.bishwajeet.designpattern.creational.abstractfactory.product.concreteproduct.LinuxCheckBox

object LinuxWidgetFactory: WidgetFactory { // Concrete Factory

    override fun createButton(): Button {
        return LinuxButton()
    }

    override fun createCheckbox(): CheckBox {
        return LinuxCheckBox()
    }
}