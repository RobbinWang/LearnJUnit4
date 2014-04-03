package org.robbin.junit;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.MethodSorters;

import static junit.framework.Assert.assertEquals;

/**
 * User: robbin
 * Date: 4/3/14
 * Time: 5:45 PM
**/
@RunWith(JUnit4.class)
@FixMethodOrder(MethodSorters.JVM)
public class QuickstartTest {

    @BeforeClass
    public static void  testBeforeClass()
    {
        System.out.println("testBeforeClass......");
    }


    @Test
    public void testEqualsB()
    {
        System.out.println("testEquals...BB.....");
        String a = "bbb";
        String b = "bbb";
        assertEquals("equal String BBB", a, b);
    }

    @Test
    public void testEqualsA()
    {
        System.out.println("testEquals...AA.....");
        String a = "aaa";
        String b = "aaa";
        assertEquals("equal String  AA", a, b);
    }

    @Test
    public void testEqualsD()
    {
        System.out.println("testEquals...DD.....");
        String a = "DDD";
        String b = "DDD";
        assertEquals("equal String DD", a, b);
    }

    @Test
    public void testEqualsC()
    {
        System.out.println("testEquals...CC.....");
        String a = "ccc";
        String b = "ccc";
        assertEquals("equal String CC", a, b);
    }


    @Before
    public void  testBefore()
    {
        System.out.println("before.......");
    }

    @After
    public void testAfter()
    {
        System.out.println("after.....");
    }

    @AfterClass
    public static void testAfterClass()
    {
        System.out.println("testAfterClass.....");
    }
}
