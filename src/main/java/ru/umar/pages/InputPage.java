package ru.umar.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class InputPage {

    public SelenideElement searchInputField = $(By.xpath("//input[@class=\"gLFyf gsfi\"]"));

    public SelenideElement searchButton(String text) {
        return $(By.xpath("//input[@value=\"" + text + "\"]"));
    }

    public SelenideElement imageTitle = $(By.xpath("//h2[@class=\"qrShPb kno-ecr-pt PZPZlf mfMhoc\"]"));

    public SelenideElement firstLine = $(By.xpath("//ul[@role=\"listbox\"]"));
}
