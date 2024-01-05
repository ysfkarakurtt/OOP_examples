package oop_lab4.pkg2;

public class OOP_Lab42 {

    public static void main(String[] args) {
        String mainString = "Dersi Java 2012 Programlama Fall";
        int firstSpace = mainString.indexOf(" ");
        int secondSpace = mainString.indexOf(" ", firstSpace + 1);
        int thirdSpace = mainString.indexOf(" ", secondSpace + 1);
        int fourthSpace = mainString.lastIndexOf(" ");

        String firstPart = mainString.substring(0, firstSpace);
        String secondPart = mainString.substring(firstSpace + 1, secondSpace);
        String thirdPart = mainString.substring(secondSpace + 1, thirdSpace);
        String fourthPart = mainString.substring(thirdSpace + 1, fourthSpace);
        String fifthPart = mainString.substring(fourthSpace + 1);

        String result = secondPart + " " + fourthPart + " " + firstPart + " " + fifthPart + " " + thirdPart;
        System.out.println(result);
    }

}
