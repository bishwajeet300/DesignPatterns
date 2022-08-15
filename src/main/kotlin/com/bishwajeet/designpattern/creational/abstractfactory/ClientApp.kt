package com.bishwajeet.designpattern.creational.abstractfactory

import com.bishwajeet.designpattern.creational.abstractfactory.factory.abstractfactory.WidgetFactory
import com.bishwajeet.designpattern.creational.abstractfactory.factory.concretefactory.LinuxWidgetFactory
import com.bishwajeet.designpattern.creational.abstractfactory.factory.concretefactory.MacWidgetFactory
import com.bishwajeet.designpattern.creational.abstractfactory.factory.concretefactory.WindowsWidgetFactory
import com.bishwajeet.designpattern.creational.abstractfactory.product.abstractproduct.Button
import com.bishwajeet.designpattern.helper.Config

class ClientApp(
    private val widgetFactory: WidgetFactory
) {

    private lateinit var button : Button

    fun createUI() {
        button = widgetFactory.createButton()
    }

    fun paint() {
        button.paint()
    }
}


/********************************    MAIN   ***********************************/
fun main() {

    val config = Config("Linux")

    val factory = when (config.OS) {
        "Mac" -> {
            MacWidgetFactory
        }
        "Linux" -> {
            LinuxWidgetFactory
        }
        "Windows" -> {
            WindowsWidgetFactory
        }
        else -> {
            throw Exception("OS not found")
        }
    }

    val widgetFactoryApplication = ClientApp(factory)
    widgetFactoryApplication.createUI()
    widgetFactoryApplication.paint()
}

