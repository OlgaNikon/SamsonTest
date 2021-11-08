package test.java.task02;

import main.java.task02.AnnotationInterception;
import main.java.task02.Priority;
import main.java.task02.TestMethodInfo;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@TestMethodInfo(priority = Priority.Critical, author = "Test user", lastModified = "20.08.2019")
//@Listeners(AnnotationInterception.class)
public class TestMethodInfoTest {

    @Test
    public void annotation() {
        assertEquals(1, 1);
    }

}
