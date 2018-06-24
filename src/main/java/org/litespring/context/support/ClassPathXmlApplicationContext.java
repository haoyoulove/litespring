package org.litespring.context.support;

import org.litespring.core.io.ClassPathResource;
import org.litespring.core.io.Resource;

/**
 * @author yangjing
 * 从classpath读取xml方式读取并实现
 */
public class ClassPathXmlApplicationContext extends AbstractApplicationContext{


	public ClassPathXmlApplicationContext(String configFile) {
		super(configFile);
	}

	protected Resource getResourceByPath(String path) {
		return new ClassPathResource(path,this.getBeanClassLoader());
	}

}
