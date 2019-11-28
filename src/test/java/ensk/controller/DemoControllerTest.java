package ensk.controller;

import com.ensk.controller.DemoController;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class DemoControllerTest {

    private DemoController demoControllerTest;

    @Before
    public void setUp() {
        demoControllerTest = new DemoController();
    }

    @After
    public void tearDown() {}

    @Test
    public void testHello() {
        Assert.assertEquals("Hello Ensk!", demoControllerTest.hello());
    }

}
