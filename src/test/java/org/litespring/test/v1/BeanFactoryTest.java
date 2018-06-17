package org.litespring.test.v1;

import org.litespring.beans.factory.BeanFactory;
import org.litespring.beans.factory.support.DefaultBeanFactory;
import org.junit.Test;

/**
 * @author yangjing
 */
public class BeanFactoryTest {


	@Test
	public void testGetBean(){

		BeanFactory factory = new DefaultBeanFactory("petstore-v1.xml");

		System.out.println(factory);
	}
}
