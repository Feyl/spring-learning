package com.feyl.spring.util.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Feyl
 */
public interface Resource {

    InputStream getInputStream() throws IOException;

}
