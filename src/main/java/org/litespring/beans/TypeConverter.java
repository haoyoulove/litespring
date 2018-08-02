package org.litespring.beans;



/**
 * @author yangjing
 */
public interface TypeConverter {

	<T> T convertIfNecessary(Object value, Class<T> requiredType) throws TypeMismatchException;
}
