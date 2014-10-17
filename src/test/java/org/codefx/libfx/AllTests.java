package org.codefx.libfx;

import org.codefx.libfx.concurrent._AllConcurrentTests;
import org.codefx.libfx.nesting._AllNestingTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Runs all tests.
 */
@RunWith(Suite.class)
@SuiteClasses({
		_AllConcurrentTests.class,
		_AllNestingTests.class,
})
public class AllTests {
	// no body needed
}
