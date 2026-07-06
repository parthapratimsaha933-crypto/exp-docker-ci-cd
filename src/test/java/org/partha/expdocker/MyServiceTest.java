package org.partha.expdocker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyServiceTest {

    private MyService serviceUnderTest = new MyService();

    @Test
    void testService() {

        String response = serviceUnderTest.helloWorld();

        Assertions.assertEquals("Hello world", response);
    }
}
