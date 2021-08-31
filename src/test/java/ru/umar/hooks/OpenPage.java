package ru.umar.hooks;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.net.MalformedURLException;

import static com.codeborne.selenide.Selenide.open;

public class OpenPage {


    @Before
    public static void openLanding() throws MalformedURLException {
        open();
    }


    @After
    public void afterConditions() {
//        Selenide.clearBrowserCookies();
        Selenide.closeWindow();
    }

}