package com.epam.kryvko.practice5.part4;

/**
 * Created by Ghost on 29.03.2016.
 */
public enum EncodingType
{
    Md5("MD5") , SHA1("SHA-1") , SHA256("SHA-256") , SHA512("SHA-512");

    private String name;

    EncodingType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
