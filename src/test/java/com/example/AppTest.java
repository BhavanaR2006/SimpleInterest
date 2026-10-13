package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

@Test
public void testSimpleInterest() {
    App obj = new App();
    assertEquals(1000.0,
            obj.calculateSimpleInterest(10000, 5, 2), 0.001);
}

@Test
public void testZeroRate() {
    App obj = new App();
    assertEquals(0.0,
            obj.calculateSimpleInterest(10000, 0, 2), 0.001);
}

@Test
public void testOneYearInterest() {
    App obj = new App();
    assertEquals(500.0,
            obj.calculateSimpleInterest(10000, 5, 1), 0.001);
}

}