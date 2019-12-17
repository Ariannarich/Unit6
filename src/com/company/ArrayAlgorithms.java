package com.company;

public class ArrayAlgorithms {

    public static String printArray(int arr[]) {
        String blank = "";
        for (int i : arr)
            blank += i + " ";
        return blank;
    }

    public static boolean checkForAllNegatives(int arr[]) {
        boolean ifNeg = true;
        for (int i : arr)
            if (i < 0)
                ifNeg = true;
            else
                ifNeg = false;
        return ifNeg;

    }

    public static boolean hasDupes(int arr[]) {
        boolean dupe = true;
        for (int i : arr)
            for (int j : arr)
                if (arr[j] == arr[i])
                    dupe = true;
        return dupe;
    }

    public static int countEvens(int arr[]) {
        int even = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                even++;
        }
        return even;
    }

    public static int[] leftShift(int[] arr, int shift) {
        int[] newArr = new int[arr.length + shift];
        for (int i : newArr)
            for (int j = 0; j < i; j++) {
                newArr[i] = j;
            }
        return newArr;
    }

    public static int[] reverseArray(int[] arr) {
   return arr;
    }
    }