package org.litespring.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author yangjing
 */
public interface Resource {


	InputStream getInputStream() throws IOException;

	String getDescription();
}
