package com.epam.kryvko.practice3.part3;

/**
 * Created by Dmytro_Kryvko on 3/24/2016.
 */
public class Demo3
{
    public static void main(String[] args)
    {
        Stack stack  = new StackImpl();
        int res = 0;
        for(int last = 0;last < 40;last++)
        {
            stack.push(last);
            System.out.println(last +" " + stack.peek() + " " + (last == (int)stack.peek()));
        }
        for(;!stack.empty();)
        {
            stack.pop();
        }
        System.out.println(stack);
   }
}
