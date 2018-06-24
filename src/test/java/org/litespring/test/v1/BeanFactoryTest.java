package org.litespring.test.v1;

import org.junit.Before;
import org.litespring.beans.BeanDefinition;
import org.junit.Assert;
import org.litespring.beans.factory.BeanCreationException;
import org.litespring.beans.factory.BeanFactory;
import org.litespring.beans.factory.support.BeanDefinitionStoreException;
import org.litespring.beans.factory.support.DefaultBeanFactory;
import org.junit.Test;
import org.litespring.beans.factory.xml.XmlBeanDefinitionReader;
import org.litespring.core.io.ClassPathResource;
import org.litespring.service.v1.PetStoreService;
import org.litespring.service.v1.PrototypeService;

/**
 * @author yangjing
 */
public class BeanFactoryTest {

	DefaultBeanFactory factory = null;
	XmlBeanDefinitionReader reader = null;

	@Before
	public void setUp(){
		factory = new DefaultBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
	}

	@Test
	public void testGetBean() {

		reader.loadBeanDefinitions(new ClassPathResource("petstore-v1.xml"));

		BeanDefinition bd = factory.getBeanDefinition("petStore");

		Assert.assertTrue(bd.isSingleton());

		Assert.assertFalse(bd.isPrototype());

		Assert.assertEquals(BeanDefinition.SCOPE_DEFAULT, bd.getScope());

		Assert.assertEquals("org.litespring.service.v1.PetStoreService", bd.getBeanClassName());

		PetStoreService petStore = (PetStoreService) factory.getBean("petStore");

		Assert.assertNotNull(petStore);

		PetStoreService petStore1 = (PetStoreService) factory.getBean("petStore");

		Assert.assertTrue(petStore.equals(petStore1));

	}

	@Test
	public void testGetPrototypeBean() {

		reader.loadBeanDefinitions(new ClassPathResource("prototype-v1.xml"));

		BeanDefinition bd = factory.getBeanDefinition("proService");

		Assert.assertTrue(bd.isPrototype());

		Assert.assertFalse(bd.isSingleton());


		Assert.assertEquals(BeanDefinition.SCOPE_PROTOTYPE, bd.getScope());

		Assert.assertEquals("org.litespring.service.v1.PrototypeService", bd.getBeanClassName());

		PrototypeService pro = (PrototypeService) factory.getBean("proService");

		Assert.assertNotNull(pro);

		PrototypeService pro2 = (PrototypeService) factory.getBean("proService");

		Assert.assertFalse(pro.equals(pro2));

	}

	@Test
	public void testInvalidBean() {

		reader.loadBeanDefinitions(new ClassPathResource("petstore-v1.xml"));
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
			reader.loadBeanDefinitions(new ClassPathResource("xx.xml"));

		} catch (BeanDefinitionStoreException e) {
			return;
		}
		Assert.fail("expect BeanDefinitionStoreException ");
	}

}












