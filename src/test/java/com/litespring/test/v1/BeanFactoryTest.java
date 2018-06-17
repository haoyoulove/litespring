package com.litespring.test.v1;

import com.litespring.beans.factory.BeanFactory;
import com.litespring.beans.factory.support.DefaultBeanFactory;
import org.junit.Test;

/**
 * @author yangjing
 */
public class BeanFactoryTest {


	@Test
	public void testGetBean(){

		BeanFactory factory = new DefaultBeanFactory("petstore-v1.xml");
		
	}
}
