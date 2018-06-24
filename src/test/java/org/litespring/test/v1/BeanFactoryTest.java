package org.litespring.test.v1;

import org.litespring.beans.BeanDefinition;
import org.junit.Assert;
import org.litespring.beans.factory.BeanCreationException;
import org.litespring.beans.factory.BeanFactory;
import org.litespring.beans.factory.support.BeanDefinitionStoreException;
import org.litespring.beans.factory.support.DefaultBeanFactory;
import org.junit.Test;
import org.litespring.service.v1.PetStoreService;

/**
 * @author yangjing
 */
public class BeanFactoryTest {


	@Test
	public void testGetBean() {

		BeanFactory factory = new DefaultBeanFactory("petstore-v1.xml");

		BeanDefinition bd = factory.getBeanDefinition("petStore");


		Assert.assertEquals("org.litespring.service.v1.PetStoreService", bd.getBeanClassName());

		PetStoreService petstore = (PetStoreService) factory.getBean("petStore");

		Assert.assertNotNull(petstore);


	}

	@Test
	public void testInvalidBean() {

		BeanFactory factory = new DefaultBeanFactory("petstore-v1.xml");
		try {
			factory.getBean("invalidBean");
		} catch (BeanCreationException e) {
			return;
		}
		Assert.fail("expect BeanCreationException ");
	}

	@Test
	public void testInvalidXML() {

		try {
			new DefaultBeanFactory("xxxx.xml");
		} catch (BeanDefinitionStoreException e) {
			return;
		}
		Assert.fail("expect BeanDefinitionStoreException ");
	}

}












