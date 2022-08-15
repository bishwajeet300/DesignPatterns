package com.bishwajeet.designpattern.creational.abstractfactory.factory.abstractfactory

import com.bishwajeet.designpattern.creational.abstractfactory.product.abstractproduct.Button
import com.bishwajeet.designpattern.creational.abstractfactory.product.abstractproduct.CheckBox

interface WidgetFactory { // AbstractFactory

    fun createButton(): Button

    fun createCheckbox(): CheckBox
}