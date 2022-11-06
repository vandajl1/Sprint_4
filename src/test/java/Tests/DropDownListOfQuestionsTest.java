package Tests;

import PajeObject.HomePOM;
import org.hamcrest.MatcherAssert;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.hamcrest.CoreMatchers.is;

public class DropDownListOfQuestionsTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        //выбор драйвера для браузера
        driver = new ChromeDriver();
    }

    @Test
    public void checkQuestions1() {


        HomePOM objHomePage = new HomePOM(driver);
        objHomePage.open();
        objHomePage.scrollHomePageDown();
        objHomePage.click_question_button_1();
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("accordion__panel-0")));
        String actualQuestionText = objHomePage.get_text_question_button_1();
        String expectedQuestionText = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        MatcherAssert.assertThat(actualQuestionText, is(expectedQuestionText));

    }

    @Test
    public void checkQuestions2() {


        HomePOM objHomePage = new HomePOM(driver);
        objHomePage.open();
        objHomePage.scrollHomePageDown();
        objHomePage.click_question_button_2();
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("accordion__panel-1")));
        String actualQuestionText = objHomePage.get_text_question_button_2();
        String expectedQuestionText = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        MatcherAssert.assertThat(actualQuestionText, is(expectedQuestionText));

    }

    @Test
    public void checkQuestions3() {


        HomePOM objHomePage = new HomePOM(driver);
        objHomePage.open();
        objHomePage.scrollHomePageDown();
        objHomePage.click_question_button_3();
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("accordion__panel-2")));
        String actualQuestionText = objHomePage.get_text_question_button_3();
        String expectedQuestionText = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        MatcherAssert.assertThat(actualQuestionText, is(expectedQuestionText));

    }

    @Test
    public void checkQuestions4() {


        HomePOM objHomePage = new HomePOM(driver);
        objHomePage.open();
        objHomePage.scrollHomePageDown();
        objHomePage.click_question_button_4();
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("accordion__panel-3")));
        String actualQuestionText = objHomePage.get_text_question_button_4();
        String expectedQuestionText = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        MatcherAssert.assertThat(actualQuestionText, is(expectedQuestionText));

    }

    @Test
    public void checkQuestions5() {


        HomePOM objHomePage = new HomePOM(driver);
        objHomePage.open();
        objHomePage.scrollHomePageDown();
        objHomePage.click_question_button_5();
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("accordion__panel-4")));
        String actualQuestionText = objHomePage.get_text_question_button_5();
        String expectedQuestionText = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        MatcherAssert.assertThat(actualQuestionText, is(expectedQuestionText));

    }

    @Test
    public void checkQuestions6() {


        HomePOM objHomePage = new HomePOM(driver);
        objHomePage.open();
        objHomePage.scrollHomePageDown();
        objHomePage.click_question_button_6();
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("accordion__panel-5")));
        String actualQuestionText = objHomePage.get_text_question_button_6();
        String expectedQuestionText = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        MatcherAssert.assertThat(actualQuestionText, is(expectedQuestionText));

    }

    @Test
    public void checkQuestions7() {


        HomePOM objHomePage = new HomePOM(driver);
        objHomePage.open();
        objHomePage.scrollHomePageDown();
        objHomePage.click_question_button_7();
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("accordion__panel-6")));
        String actualQuestionText = objHomePage.get_text_question_button_7();
        String expectedQuestionText = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        MatcherAssert.assertThat(actualQuestionText, is(expectedQuestionText));

    }

    @Test
    public void checkQuestions8() {


        HomePOM objHomePage = new HomePOM(driver);
        objHomePage.open();
        objHomePage.scrollHomePageDown();
        objHomePage.click_question_button_8();
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("accordion__panel-7")));
        String actualQuestionText = objHomePage.get_text_question_button_8();
        String expectedQuestionText = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        MatcherAssert.assertThat(actualQuestionText, is(expectedQuestionText));

    }

    @After
    public void teardown() {
        // Закрытие браузер
        driver.quit();
    }


}
