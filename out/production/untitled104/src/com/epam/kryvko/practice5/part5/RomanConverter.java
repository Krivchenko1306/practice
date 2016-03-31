package com.epam.kryvko.practice5.part5;

/**
 * Created by Dmytro_Kryvko on 3/29/2016.
 */
public class RomanConverter {

    private static RomanNumber[] numbers = new RomanNumber[]{RomanNumber.I, RomanNumber.IV,
            RomanNumber.V, RomanNumber.IX, RomanNumber.X,
            RomanNumber.XL, RomanNumber.L, RomanNumber.XC, RomanNumber.C};

    private enum RomanNumber {
        I(1), IV(4), V(5), IX(9), X(10), XL(40), L(50), XC(90), C(100);

        private int value;

        RomanNumber(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }


    }


    public static String decimal2Roman(int x) {
        StringBuilder builder = new StringBuilder();
        for (int count = numbers.length - 1; x > 0; ) {
            if (x < numbers[count].getValue()) {
                count--;
            } else {
                x -= numbers[count].getValue();
                builder.append(numbers[count].name());
            }
        }
        return builder.toString();
    }

    public static int roman2Decimal(String s) {
        int value = 0;
        for (int count = s.length(); count > 1; count--) {
            System.out.println(RomanNumber.valueOf(s.substring(count - 2, count)));
            int val1 = RomanNumber.valueOf(s.substring(count - 1, count)).getValue();
            int val2 = RomanNumber.valueOf(s.substring(count - 2, count - 1)).getValue();
            if (val1 < val2) {
                value += val1;
            } else {
                value += RomanNumber.valueOf(s.substring(count - 2, count)).getValue();
            }
        }
        value += RomanNumber.valueOf(s.substring(0, 1)).getValue();
        return value;
    }
}
