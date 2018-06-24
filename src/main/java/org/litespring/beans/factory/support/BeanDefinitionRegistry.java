package org.litespring.beans.factory.support;

import org.litespring.beans.BeanDefinition;

/**
 * @author yangjing
 * 获取bean和注册bean
 */
public interface BeanDefinitionRegistry {

	BeanDefinition getBeanDefinition(String beanID);
	void registerBeanDefinition(String beanID, BeanDefinition bd);
}
