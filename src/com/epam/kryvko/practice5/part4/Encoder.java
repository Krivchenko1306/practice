package com.epam.kryvko.practice5.part4;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Ghost on 29.03.2016.
 */
public class Encoder
{

  public   String  toHex(String password , EncodingType type) throws UnsupportedEncodingException, NoSuchAlgorithmException
  {
       StringBuilder hex = new StringBuilder();
       MessageDigest crypt = MessageDigest.getInstance(type.getName());
       crypt.reset();
       crypt.update(password.getBytes("UTF-8"));
       byte[] bytes = crypt.digest();
       for(byte b: bytes)
       {
           hex.append(String.format("%02x" , b));
       }
       return hex.toString();

  }

}
