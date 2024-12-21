package org.example;

import java.util.HashMap;
import java.util.HashSet;

public class Words {
    public static void main(String[] args) {
        String[] words = {"кот", "собака", "кот", "хомяк", "собака", "лиса",
                "кролик", "волк", "волк", "кот", "хомяк", "лиса", "хомяк"};

        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Уникальные слова: " + new HashSet<>(wordCount.keySet()));

        System.out.println("Кол-во слов:");
        for (String word : wordCount.keySet()) {
            System.out.println(word + ": " + wordCount.get(word));
        }
    }
}
