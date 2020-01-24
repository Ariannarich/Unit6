package com.company;

public class Main {

    public static void main(String[] args) {
	int num = 913742685;
	int x, y = 0;
	while (num > 0)
    {
        x = num % 10;
        num/=10;
        if (x>= 5)
            y++;
    }
	System.out.println(y);
    }
}
