package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class etsySearchPage {

    public etsySearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(name= "search_query")
    public WebElement searcBox;

    @FindBy(xpath = "//button[@value='Search']")
    public WebElement searchBoxBtn;
}
