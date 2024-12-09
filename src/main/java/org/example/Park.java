package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Park {
    private List<Attraction> attractions;

    public Park() {
        attractions = new ArrayList<>();
    }

    public void addAttraction(String name, String workTime, BigDecimal price) {
        attractions.add(new Attraction(name, workTime, price));
    }

    public void printAttractions() {
        for (Attraction attraction : attractions) {
            attraction.printInfo();
        }
    }

    // Внутренний класс аттракциона
    class Attraction {
        private String name;
        private String workTime;
        private BigDecimal price;

        public Attraction(String name, String workTime, BigDecimal price) {
            this.name = name;
            this.workTime = workTime;
            this.price = price;
        }

        public void printInfo() {
            System.out.println("Аттракцион: " + name + ", Время работы: " + workTime + ", Стоимость: " + price);
        }
    }
}
