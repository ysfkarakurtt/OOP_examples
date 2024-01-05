package oop_lab5.pkg2;

import java.util.Scanner;

public class OOP_Lab52 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matris = new int[4][];

        for (int i = 0; i < 4; i++) {
            System.out.print("Satir " + (i + 1) + " icin sutun sayisini girin: ");
            int columnCount = scan.nextInt();

            matris[i] = new int[columnCount];
            for (int j = 0; j < columnCount; j++) {
                System.out.print("Matris[" + i + "][" + j + "]: ");
                matris[i][j] = scan.nextInt();
            }
        }

        System.out.println("Girilen Matris:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
    }

}
