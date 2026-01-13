package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SimpleJUnitTest {

    @BeforeEach
    void beforeEach() {
        System.out.println("### BeforeEach: 3");
        Assertions.assertEquals(3, 3); // проверка
    }

    @AfterEach
    void afterEach() {
        System.out.println("### AfterEach: 3");
        Assertions.assertEquals(3, 3); // проверка
    }

    @Test
    void firstTest() {
        System.out.println("### firstTest()");
        Assertions.assertTrue(3 > 2);
    }

    @Test
    void secondTest() {
        System.out.println("### secondTest()");
        Assertions.assertTrue(3 > 2);
    }

    @Test
    void thirdTest() {
        System.out.println("### thirdTest()");
        Assertions.assertTrue(3 > 2);
    }
}
