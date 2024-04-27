package com.sahed.khodder.util;

import java.util.UUID;

public class ProductRandomSKUGenerator {

    private static final String prefix = "SKU-";

    /**
     * create a random product Stock Keeping unit
     * @param length int
     * @return String
     */
    public static String generate(int length){
        String uuid = UUID.randomUUID().toString().replace("-","");

        if (uuid.length()> length){
            uuid = uuid.substring(0, length);
        }else {
            while (uuid.length()<length){
                uuid += UUID.randomUUID().toString().replace("-","");
            }
            uuid += uuid.substring(0, length);
        }
        return prefix + uuid;
    }

    /**
     * create a random product Stock Keeping unit with exact 55 character.
     * @return String
     */
    public static String generate(){
        return generate(51);
    }
}
