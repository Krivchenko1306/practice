package com.epam.kryvko.trainig;

/**
 * Created by Dmytro_Kryvko on 3/31/2016.
 */
public class ThreadTest
{


    private boolean flag;

    public synchronized void m(boolean flag)
    {

        this.flag = flag;
        try {
            System.out.println("FJKLDG");
            System.out.flush();
            Thread.currentThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(flag);
        System.out.flush();
    }


        ThreadTest()
        {

            new Thread()
            {
                public void run(){while (true) m(true);}
            }.start();
            new Thread()
            {
                public void run(){while (true) m(false);}
            }.start();
        }


    public static void main(String[] args) {
            new ThreadTest();
    }


}
