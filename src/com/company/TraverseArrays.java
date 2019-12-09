package com.company;

public class TraverseArrays {
    public static int countEven(int[] num) {
        int even = 0;

        for (int i = 0; 0 < num.length-1; i++) {
            for (int j = 0; j <= num[i]; j++)
                if (j % 2 == 0)
                    even++;
        }
        return even;
    }

    public static int[] buildArray(int n) {

        int[] arr = new int[n];
        int i = 0;
        while (i < arr.length) {
            for (int j = 0; j < arr[i]; j++)
                i += 1;
            i++;
        }
        return arr;
    }

    public static boolean sum28(int[] num) {
        int even = 0;

        for (int i = 0; 0 < num.length; i++) {
            for (int j = 0; j <= num[i]; j++)
                if (j == 2)
                    even += 2;
        }
        if (even == 8)
            return true;
        else
            return false;
    }

    public static int[] zeroMax(int[] og) {
        for (int i = 0; 0 < og.length; i++) {
            for (int j = 0; j <= og[i]; j++)
                if (og[i] == 0)
                    if (og[i + 1] % 2 != 0)
                        og[i + 1] = og[i];


        }
        return og;
    }
    public void selfDivisor()
    {

    }
}
