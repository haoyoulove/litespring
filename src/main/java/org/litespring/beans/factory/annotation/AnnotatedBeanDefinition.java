package org.litespring.beans.factory.annotation;

import org.litespring.beans.BeanDefinition;
import org.litespring.core.type.AnnotationMetadata;

/**
 * @author yangjing
 */
public interface AnnotatedBeanDefinition extends BeanDefinition {
	AnnotationMetadata getMetadata();
}