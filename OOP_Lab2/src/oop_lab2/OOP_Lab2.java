package oop_lab2;

import java.util.Scanner;

public class OOP_Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double value, value2, result;

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen birinci sayiyi giriniz:");
        value = scan.nextDouble();
        System.out.println("Lutfen ikinci sayiyi giriniz:");
        value2 = scan.nextDouble();
        result = (value + value2);
        System.out.println("Girmis oldugunuz sayilarin toplami :" + result);

    }

}
