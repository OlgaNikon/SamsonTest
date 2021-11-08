package test.java.task01;

import main.java.task01.MainPage;
import main.java.task01.MethodInterception;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MethodInterceptionTest {

    @Test
    public void annotationValue() {
        MethodInterception methodInterception = new MethodInterception();
        MainPage mainPage = methodInterception.createPage(MainPage.class);
        assertNotNull(mainPage);
        assertEquals(mainPage.buttonSearch(), ".//*[@test-attr='button_search']");
        assertEquals(mainPage.textInputSearch(), ".//*[@test-attr='input_search']");
    }

}