package com.testpaczka;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest extends TestCase {

    public AppTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(AppTest.class);
    }
    public void testKwadrat() {
        assertEquals(4, App.kwadrat(2));
        assertEquals(9, App.kwadrat(3));
        assertEquals(0, App.kwadrat(0));
        assertEquals(1, App.kwadrat(-1));
        assertEquals(16, App.kwadrat(-4));
    }
}
