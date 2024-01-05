package oop_lab4;

import java.util.Scanner;

public class OOP_Lab4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Bir text giriniz:");
        String text = scan.nextLine();
        int spaceCount = 0;
        int lowerChar = 0;
        int i;
        for (i = 0; i < text.length(); i++) {
            char bosluk = text.charAt(i);
            if (Character.isWhitespace(bosluk)) {
                spaceCount++;
            } else if (Character.isLowerCase(bosluk)) {
                lowerChar++;
            }

        }
        System.out.println("Bosluk karakter sayisi:" + spaceCount);
        System.out.println("kucuk harfli karakter sayisi:" + lowerChar);

    }

}
