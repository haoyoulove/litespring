package org.litespring.context.support;

import org.litespring.beans.factory.config.RuntimeBeanReference;
import org.litespring.beans.factory.config.TypedStringValue;
import org.litespring.beans.factory.support.DefaultBeanFactory;

/**
 * @author yangjing
 */
public class BeanDefinitionValueResolver {

	private final DefaultBeanFactory beanFactory;

	public BeanDefinitionValueResolver(
			DefaultBeanFactory beanFactory) {

		this.beanFactory = beanFactory;
	}

	public Object resolveValueIfNecessary(Object value) {

		if (value instanceof RuntimeBeanReference) {
			RuntimeBeanReference ref = (RuntimeBeanReference) value;
			String refName = ref.getBeanName();
			return this.beanFactory.getBean(refName);

		} else if (value instanceof TypedStringValue) {
			return ((TypedStringValue) value).getValue();
		} else {
			//TODO
			throw new RuntimeException("the value " + value + " has not implemented");
		}
	}
}
