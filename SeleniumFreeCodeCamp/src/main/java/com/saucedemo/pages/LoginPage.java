package com.saucedemo.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private By usernameField = By.id("user-name"); //esse valor esta na arvore DOM da pagina, asta inspecionar os elementos na web
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMessage = By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3"); //xpath tbm pode ser copiado da arvore DOM o inspecionar o elemento

    public void setUsername(String username){
        set(usernameField, username); //metodo herdado de BasePage
    }

    public void setPassword(String password){
        set(passwordField, password);
    }

    public ProductsPage clickLoginButton(){ //transition method
        click(loginButton);
        return new ProductsPage();
    }

    public ProductsPage logIntoApplication(String username, String password){ //transition method
        this.setUsername(username);
        this.setPassword(password);
        return clickLoginButton();
    }

    public String getErrorMessage(){
        return find(errorMessage).getText();
    }
}
