package com.epam.kryvko.practice5.part4;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Ghost on 29.03.2016.
 */
public class Demo
{
    public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        Encoder encoder = new Encoder();
        System.out.println(encoder.toHex("asfbdbd", EncodingType.Md5));
    }
}
