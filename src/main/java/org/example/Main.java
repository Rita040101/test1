package org.example;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Person[] employees = new Person[5];
        employees[0] = new Person("Иванов Иван", "Инженер", "ivivan@mailbox.com", "892312312", new BigDecimal("30000"), 30);
        employees[1] = new Person("Петрова Алла", "Директор", "petrova@mailbox.com", "897894083", new BigDecimal("80000"), 43);
        employees[2] = new Person("Бобров Павел", "Менеджер", "bobrov@mailbox.com", "895673892", new BigDecimal("20000"), 27);
        employees[3] = new Person("Сомойлов Леонид", "Аналитик", "somoylov@mailbox.com", "890092847", new BigDecimal("40000"), 29);
        employees[4] = new Person("Масляк Игорь", "Разработчик", "maslyak@mailbox.com", "892209578", new BigDecimal("45000"), 33);

        System.out.println("Информация о сотрудниках:");
        for (Person employee : employees) {
            employee.printInfo();
        }

        Park park = new Park();
        park.addAttraction("Американские горки", "12:00 - 19:00", new BigDecimal("15"));
        park.addAttraction("Колесо обозрения", "13:00 - 20:00", new BigDecimal("20"));

        System.out.println("\nИнформация об аттракционах:");
        park.printAttractions();
    }
}
