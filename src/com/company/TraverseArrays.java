package com.company;

public class TraverseArrays {
    public static int countEven(int[] num) {
        int even = 0;
        for (int i = 0; i < num.length; i++) {
                if (num[i] % 2 == 0)
                    even++;
                else
                    i++;
        }
        return even;
    }

    public static int[] buildArray(int n) {

        int[] arr = new int[n];

        for(int i = 0;i < arr.length;i++)
        {
            arr[i]= i;
        }
        return arr;
    }

    public static boolean sum28(int[] num) {
        int even = 0;

        for (int i = 0; i < num.length; i++) {
                if (num[i] == 2)
                    even += 2;
        }
        if (even == 8)
            return true;
        else
            return false;
    }

    public static int[] zeroMax(int[] og) {
        for (int i = 0; i < og.length; i++) {
                if (og[i] == 0 )
                    if (og[i + 1] % 2 != 0)
                        og[i]= og[i + 1];
                    else
                        og[i]=og[0];


        }
        return og;
    }

}
