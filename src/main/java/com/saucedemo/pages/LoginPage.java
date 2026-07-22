package com.saucedemo.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{

    private By usernameFiled = By.id("user-name");
    private By passwordFiled = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMessage = By.xpath("//form//h3[@data-test=\"error\"]");

    public void setUsername(String username) {
        set(usernameFiled, username);
    }

    public void setPassword(String password) {
        set(passwordFiled, password);
    }

    public ProductsPage clickLoginButton() {
        click(loginButton);
        return new ProductsPage();
    }

    public ProductsPage lgIntoApplication(String username, String password) {
        setUsername(username);
        setPassword(password);
        return clickLoginButton();
    }

    public String getErrorMessage() {
       return find(errorMessage).getText();
    }

}
