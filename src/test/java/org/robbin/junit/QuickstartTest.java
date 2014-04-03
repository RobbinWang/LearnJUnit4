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
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class QuickstartTest {

    @BeforeClass
    public static void  testBeforeClass()
    {
        System.out.println("testBeforeClass......");
    }

    @Test
    public void testEquals1()
    {
        System.out.println("testEquals...1.....");
        String a = "abc";
        String b = "abc";
        assertEquals("equal String", a, b);
    }
    @Test
    public void testEquals5()
    {
        System.out.println("testEquals..5......");
        String a = "abc";
        String b = "abc";
        assertEquals("equal String", a, b);
    }
    @Test
    public void testEquals4()
    {
        System.out.println("testEquals...4.....");
        String a = "abc";
        String b = "abc";
        assertEquals("equal String", a, b);
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