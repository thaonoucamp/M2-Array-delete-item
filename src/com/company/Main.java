package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// B1: khai bao va khoi tao mang so nguyen n phan tu;
        int []arr = {1,2,3,4,5,6,7,8,9};
        int index = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int x = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                for (int j = i; j < arr.length-1; j++) {
                    arr[j] = arr[j+1];
                }
                index = i;
            }
            System.out.println(arr[i]);
        }
        System.out.println("da xoa: "+x+" tai vi tri: "+index);
    }
}
