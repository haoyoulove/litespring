package org.litespring.test.v1;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author yangjing
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
		ApplictionContextTest.class,
		BeanFactoryTest.class,
		ResourceTest.class})
public class V1AllTests {

}
