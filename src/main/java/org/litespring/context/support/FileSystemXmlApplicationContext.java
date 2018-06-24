package org.litespring.context.support;

import org.litespring.beans.factory.support.DefaultBeanFactory;
import org.litespring.beans.factory.xml.XmlBeanDefinitionReader;
import org.litespring.context.ApplicationContext;
import org.litespring.core.io.FileSystemResource;
import org.litespring.core.io.Resource;

/**
 * @author yangjing
 */
public class FileSystemXmlApplicationContext extends AbstractApplicationContext {


	public FileSystemXmlApplicationContext(String configFile) {
		super(configFile);
	}

	protected Resource getResourceByPath(String path) {
		return new FileSystemResource(path);
	}


}
