package oop_lab5.pkg3;

import java.util.ArrayList;

public class OOP_Lab53 {

    public static void main(String[] args) {
        String[] arr = {"sari", "siyah", "mavi", "kirmizi", "yesil", "turuncu", "pembe", "mor", "beyaz", "gri"};
        ArrayList<String> words = new ArrayList<>();
        for (String word : arr) {
            words.add(word);
        }

        // ArrayList'i yazdırdım
        for (String word : words) {
            System.out.println(word);
        }
    }

}
