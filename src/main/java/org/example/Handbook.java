package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Handbook {
    private final HashMap<String, List<String>> phoneBook;

    public Handbook() {
        phoneBook = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        phoneBook.putIfAbsent(surname, new ArrayList<>());
        phoneBook.get(surname).add(phoneNumber);
    }

    public List<String> get(String surname) {
        return phoneBook.getOrDefault(surname, new ArrayList<>());
    }

    public static void main(String[] args) {
        Handbook handbook = new Handbook();

        handbook.add("Vasiluk", "123456");
        handbook.add("Bogrov", "654321");
        handbook.add("Vasiluk", "789012");
        handbook.add("Malikov", "456789");

        System.out.println("Номер телефона Василюка: " + handbook.get("Vasiluk"));
        System.out.println("Номер телефона Богрова: " + handbook.get("Bogrov"));
        System.out.println("Номер телефона Маликова: " + handbook.get("Malikov"));
        System.out.println("Номер телефона Иванова: " + handbook.get("Ivanov"));
    }
}
