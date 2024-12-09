package org.example;

import java.math.BigDecimal;

public class Person {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private BigDecimal salary;
    private int age;

    public Person(String fullName, String position, String email, String phone, BigDecimal salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Сотрудник: " + fullName + ", Должность: " + position + ", Email: " + email +
                ", Телефон: " + phone + ", Зарплата: " + salary + ", Возраст: " + age);
    }
}
