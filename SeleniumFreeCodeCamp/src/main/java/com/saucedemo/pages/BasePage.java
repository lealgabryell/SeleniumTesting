package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage { //Page Object Model
    public static WebDriver driver;

    public void ssetDriver(WebDriver driver){
        BasePage.driver = driver;
    }

    protected WebElement find(By locator){ //usa o By do Selenium para encontrar um elemento
        return driver.findElement(locator); //retorna um WebElement
    }

    protected void set(By locator, String text){
        this.find(locator).clear(); //limpa o campo se ele ja estiver sujo
        this.find(locator).sendKeys(text); //coloca o texto no elementoo desejado
    }

    protected void click(By locator){
        this.find(locator).click();
    }
}
