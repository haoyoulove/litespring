package org.litespring.test.v1;

import org.litespring.context.ApplicationContext;
import org.junit.Assert;
import org.junit.Test;
import org.litespring.context.support.ClassPathXmlApplicationContext;
import org.litespring.context.support.FileSystemXmlApplicationContext;
import org.litespring.service.v1.PetStoreService;

/**
 * @author yangjing
 */
public class ApplictionContextTest {

	@Test
	public void testGetBean() {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("petstore-v1.xml");
		PetStoreService petStore = (PetStoreService) ctx.getBean("petStore");
		Assert.assertNotNull(petStore);
	}

	@Test
	public void testGetBeanFromFileSystemContext() {
		//注意啊，这里仍然是hardcode了一个本地路径，这是不好的实践!! 如何处理，留作作业
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src\\test\\resource\\petstore-v1.xml");
		PetStoreService petStore = (PetStoreService) ctx.getBean("petStore");
		Assert.assertNotNull(petStore);

	}
}
