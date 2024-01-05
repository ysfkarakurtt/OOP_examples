package oop_lab5;

import java.util.Arrays;
import java.util.Scanner;

public class OOP_Lab5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Lutfen 1.dizinin " + (i + 1) + ".elamanini giriniz:");
            arr1[i] = scan.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Lutfen 2.dizinin " + (i + 1) + ".elamanini giriniz:");
            arr2[i] = scan.nextInt();
        }
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("iki tam sayi dizisi esit");
        } else {
            System.out.println("iki tam sayi dizisi esit degil");
        }

    }
}
