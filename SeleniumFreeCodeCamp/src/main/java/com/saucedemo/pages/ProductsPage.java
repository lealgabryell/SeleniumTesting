package com.saucedemo.pages;

import org.openqa.selenium.By;

public class ProductsPage extends BasePage{

    private By productsHeader = By.xpath("//span[text()='Products']");

    public boolean isProductheaadderDisplayed(){ //checa se a pagina vai ter o text Products em um elemento da pagina
        return find(productsHeader).isDisplayed();
    }
}
