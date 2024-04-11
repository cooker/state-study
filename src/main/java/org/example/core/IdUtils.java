package org.example.core;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * grant
 * 28/3/2024 5:26 pm
 **/
public class IdUtils {

    public static String id() {
        return System.currentTimeMillis() + RandomStringUtils.randomNumeric(4);
    }
}
