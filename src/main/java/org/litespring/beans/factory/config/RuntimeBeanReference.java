package org.litespring.beans.factory.config;

/**
 * @author yangjing
 */
public class RuntimeBeanReference {

	private final String beanName;

	public RuntimeBeanReference(String beanName) {
		this.beanName = beanName;
	}

	public String getBeanName() {
		return beanName;
	}
}

