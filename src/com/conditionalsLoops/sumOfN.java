package com.conditionalsLoops;

import java.util.Scanner;

public class sumOfN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n:");
        int n=sc.nextInt();
        int sum=(n*(n+1))/2;
        System.out.println("Sum:"+sum);
    }
}
