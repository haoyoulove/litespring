package org.litespring.beans.factory.config;

/**
 * @author yangjing
 */
public interface SingletonBeanRegistry {

	void registerSingleton(String beanName, Object singletonObject);
	Object getSingleton(String beanName);
}
