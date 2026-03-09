package com.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {
    @Test
    public void testAdd() {
        App calc = new App();
        assertEquals(10, calc.add(5, 5));
    }
}
