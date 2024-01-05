package oop_lab6;

import java.util.ArrayList;
import java.util.Scanner;

public class OOP_Lab6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence;

        while (true) {

            printMenu();

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:

                    System.out.print("Bir cumle girin: ");
                    sentence = scanner.nextLine();
                    int charCount = countCharacters(sentence);
                    System.out.println("Karakter sayisi: " + charCount);
                    break;

                case 2:

                    System.out.print("Iki kelime girin (boslukla ayirin): ");
                    String[] words = scanner.nextLine().split(" ");
                    String commonChars = findCommonCharacters(words[0], words[1]);
                    System.out.println("Ortak karakterler: " + commonChars);
                    break;

                case 3:

                    System.out.print("Bir cumle girin: ");
                    sentence = scanner.nextLine();
                    ArrayList<String> wordList = convertToArrayList(sentence);
                    System.out.println("ArrayList: " + wordList.toString());
                    break;

                case 4:

                    System.out.println("Programdan cikiliyor.");
                    System.exit(0);

                default:
                    System.out.println("Gecersiz secim. Lutfen tekrar deneyin.");
            }
        }
    }

    private static int countCharacters(String sentence) {
        return sentence.length();
    }

    private static String findCommonCharacters(String word1, String word2) {
        StringBuilder commonChars = new StringBuilder();
        for (char c : word1.toCharArray()) {
            if (word2.contains(String.valueOf(c)) && !commonChars.toString().contains(String.valueOf(c))) {
                commonChars.append(c);
            }
        }
        return commonChars.toString();
    }

    private static ArrayList<String> convertToArrayList(String sentence) {
        String[] words = sentence.split(" ");
        ArrayList<String> wordList = new ArrayList<>();
        for (String word : words) {
            wordList.add(word);
        }
        return wordList;
    }

    private static void printMenu() {
        System.out.println("Menu:");
        System.out.println("1. Karekter sayisini say");
        System.out.println("2. Iki kelime arasindaki ortak karakterleri bul");
        System.out.println("3. Cumleyi ArrayList'e donustur");
        System.out.println("4. cikis");
        System.out.print("Lutfen bir secenek girin (1 ile 4 arasi giris yapar misin): ");
    }

}
