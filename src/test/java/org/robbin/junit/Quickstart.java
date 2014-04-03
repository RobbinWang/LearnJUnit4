package org.robbin.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: robbin
 * Date: 4/3/14
 * Time: 5:45 PM
 * To change this template use File | Settings | File Templates.
 */
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
