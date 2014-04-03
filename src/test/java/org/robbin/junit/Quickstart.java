package org.robbin.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static junit.framework.Assert.assertEquals;

/**
 * User: robbin
 * Date: 4/3/14
 * Time: 5:45 PM
**/
@RunWith(JUnit4.class)
public class Quickstart {

    @Test
    public void testEquals()
    {
        String a = "abc";
        String b = "abc";
        assertEquals("equal String", a, b);
    }
}
