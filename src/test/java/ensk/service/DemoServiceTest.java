package ensk.service;

import com.ensk.service.DemoService;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DemoServiceTest {

    private DemoService demoService;

    @Before
    public void setUp() {
        demoService = new DemoService();
    }

    @After
    public void tearDown() {}

    @Test
    public void testGetProduct() {
        // Assert.assertEquals("iPhone 11 Pro Max", demoService.getProduct());
    }
}
