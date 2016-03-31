package com.epam.kryvko.practice6.part3;

/**
 * Created by Dmytro_Kryvko on 3/29/2016.
 */
public class TypeFactory {
    public static Type getType(String type) {
        switch (type) {
            case "int":
                return Type.Int;
            case "char":
                return Type.Char;
            case "String":
                return Type.String;
            case "double":
                return Type.Double;
            default:
                return Type.NoType;
        }
    }
}
