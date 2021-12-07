package com.winterchen.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author CENTURY
 * @version 1.0
 * @date 2021/12/2 16:20
 * @description TODO
 **/
public interface Resource {

    InputStream getInputStream() throws IOException;

}