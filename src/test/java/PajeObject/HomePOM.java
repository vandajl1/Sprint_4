package PajeObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePOM {


    private WebDriver driver;
    private final String url = "https://qa-scooter.praktikum-services.ru/";


    //локаторы для каждой строчки выпадающего списка в разделе «Вопросы о важном».
    private By question_button_1 = By.id("accordion__heading-0");
    private By question_button_2 = By.id("accordion__heading-1");
    private By question_button_3 = By.id("accordion__heading-2");
    private By question_button_4 = By.id("accordion__heading-3");
    private By question_button_5 = By.id("accordion__heading-4");
    private By question_button_6 = By.id("accordion__heading-5");
    private By question_button_7 = By.id("accordion__heading-6");
    private By question_button_8 = By.id("accordion__heading-7");

    //локаторы для текста в каждой строчке выпадающего списка в разделе «Вопросы о важном».
    private By text_question_button_1 = By.id("accordion__panel-0");
    private By text_question_button_2 = By.id("accordion__panel-1");
    private By text_question_button_3 = By.id("accordion__panel-2");
    private By text_question_button_4 = By.id("accordion__panel-3");
    private By text_question_button_5 = By.id("accordion__panel-4");
    private By text_question_button_6 = By.id("accordion__panel-5");
    private By text_question_button_7 = By.id("accordion__panel-6");
    private By text_question_button_8 = By.id("accordion__panel-7");

    public HomePOM(WebDriver driver) {
        this.driver = driver;

    }

    public HomePOM open() {
        driver.get(url);
        return this;
    }

    //Методы для клика по вопросу каждой строчки выпадающего списка в разделе «Вопросы о важном».

    public void click_question_button_1() {
        driver.findElement(question_button_1).click();
    }

    public void click_question_button_2() {
        driver.findElement(question_button_2).click();
    }

    public void click_question_button_3() {
        driver.findElement(question_button_3).click();
    }

    public void click_question_button_4() {
        driver.findElement(question_button_4).click();
    }

    public void click_question_button_5() {
        driver.findElement(question_button_5).click();
    }

    public void click_question_button_6() {
        driver.findElement(question_button_6).click();
    }

    public void click_question_button_7() {
        driver.findElement(question_button_7).click();
    }

    public void click_question_button_8() {
        driver.findElement(question_button_8).click();
    }

    //Методы для получения текста ответа на вопрос каждой строчки выпадающего списка в разделе «Вопросы о важном».

    public String get_text_question_button_1() {
        return driver.findElement(text_question_button_1).getText();
    }

    public String get_text_question_button_2() {
        return driver.findElement(text_question_button_2).getText();
    }

    public String get_text_question_button_3() {
        return driver.findElement(text_question_button_3).getText();
    }

    public String get_text_question_button_4() {
        return driver.findElement(text_question_button_4).getText();
    }

    public String get_text_question_button_5() {
        return driver.findElement(text_question_button_5).getText();
    }

    public String get_text_question_button_6() {
        return driver.findElement(text_question_button_6).getText();
    }

    public String get_text_question_button_7() {
        return driver.findElement(text_question_button_7).getText();
    }

    public String get_text_question_button_8() {
        return driver.findElement(text_question_button_8).getText();
    }

    //метод для прокрутки страницы вниз к списку вопросов.
    public void scrollHomePageDown() {
        WebElement element = driver.findElement(By.id("accordion__heading-0"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }


}


