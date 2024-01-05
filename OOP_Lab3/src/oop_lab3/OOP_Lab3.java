package oop_lab3;

import java.util.Scanner;

public class OOP_Lab3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double radius, enviroment, area;

        System.out.println("Lutfen dairenin yaricapini giriniz:");
        radius = scan.nextDouble();
        enviroment = 2 * (Math.PI) * radius;
        area = (Math.PI) * radius * radius;
        System.out.println("Dairenin cevresi: " + enviroment);
        System.out.println("Dairenin alani: " + area);

        double equation1, equation2, x = 1.2, y = 14;
        //equation1= (9*x*x)+((3*x*7*2)/y)+((7*7)/(y*y));
        equation1 = Math.pow(((3 * x) + 7 / y), 2);
        System.out.println("ilk denklemin sonucu :" + equation1);
        x = 6;
        y = 4;
        equation2 = 2 * ((x * x) + 2 * y) / (y * y);
        System.out.println("ikinci denklemin sonucu :" + equation2);
    }

}
