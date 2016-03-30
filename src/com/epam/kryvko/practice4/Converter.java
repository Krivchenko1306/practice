package com.epam.kryvko.practice4;

/**
 * Created by Ghost on 26.03.2016.
 */
public interface Converter<S , R>
{
    R  convert(S sr);
}
