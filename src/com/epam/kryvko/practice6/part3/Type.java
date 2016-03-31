package com.epam.kryvko.practice6.part3;

/**
 * Created by Dmytro_Kryvko on 3/29/2016.
 */
public enum Type
{
    Int("(?<=^|\\s)(\\d+)(?=\\s|$)") ,
    Double("(((\\d+)(\\.|,)(\\d+))|((\\.|,)(\\d+))|((\\d+)(\\.|,)))(?=\\s|$)") ,
    Char("(?<=^|\\s)[a-zA-zа-яА-Я](?=\\s)") ,
    String("[a-zA-zа-яА-Я]{2,}") ,
    NoType("^$");


    private  String regex;


    Type(java.lang.String regex) {
        this.regex = regex;
    }

    public String getRegex()
    {
        return  regex;
    }
}
