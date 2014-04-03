package org.robbin.junit.exception;

import org.junit.Test;

/**
 * User: robbin
 * Date: 4/3/14
 * Time: 10:56 PM
 */
public class ExceptionTest {

    @Test(expected = RuntimeException.class)
    public void testException() {
        throw new RuntimeException("run time exception!");
    }

    @Test(expected = RuntimeException.class)
    public void testSimpleException()
    {
        throw new SimpleException("simple exception!");
    }

    private class SimpleException extends RuntimeException {

        public SimpleException(String msg) {
            super(msg);
        }
    }
}
