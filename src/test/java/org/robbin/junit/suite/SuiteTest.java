package org.robbin.junit.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.robbin.junit.QuickstartTest;
import org.robbin.junit.exception.ExceptionTest;

/**
 * User: robbin
 * Date: 4/3/14
 * Time: 11:36 PM
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ExceptionTest.class, QuickstartTest.class})
public class SuiteTest {


}
