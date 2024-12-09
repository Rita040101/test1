package org.example;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Чарли");
        Dog dog2 = new Dog("Кэри");
        Cat cat1 = new Cat("Тайсон");
        Cat cat2 = new Cat("Ватсон");

        dog1.run(394);
        dog1.swim(9);
        dog2.run(599);
        dog2.swim(11);
        cat1.run(143);
        cat1.swim(7);
        cat2.run(243);

        System.out.println("\nСоздано: ");
        System.out.println("Котов: " + Cat.catCount);
        System.out.println("Собак: " + Dog.dogCount);
        System.out.println("Животных всего: " + Animal.animalCount);

        Cat[] cats = {cat1, cat2, new Cat("Партос")};
        Bowl bowl = new Bowl(10);

        System.out.println("\nКоты кушают:");
        for (Cat cat : cats) {
            cat.eat(bowl);
        }

        System.out.println("\nКто сытый:");
        for (Cat cat : cats) {
            System.out.println(cat.name + " сытый: " + cat.isFull);
        }
        System.out.println("Осталось еды: " + bowl.food);

        bowl.addFood(36);
        System.out.println("Добавили еды: " + bowl.food);
    }
}

class Animal {
    public static int animalCount = 0;
    public String name;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public void run(int distance) {
        System.out.println(name + " пробежал(а) " + distance + " метров");
    }

    public void swim(int distance) {
        System.out.println(name + " проплыл(а) " + distance + " метров");
    }
}

class Dog extends Animal {
    public static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;
    }


    public void run(int distance) {
        if (distance <= 500) {
            System.out.println(name + " пробежал(а) " + distance + " метров");
        } else {
            System.out.println(name + " не может пробежать больше 500 метров");
        }
    }

    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println(name + " проплыл(а) " + distance + " метров");
        } else {
            System.out.println(name + " не может проплыть больше 10 метров");
        }
    }
}

class Cat extends Animal {
    public static int catCount = 0;
    public boolean isFull;

    public Cat(String name) {
        super(name);
        this.isFull = false;
        catCount++;
    }

    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(name + " пробежал(а) " + distance + " метров");
        } else {
            System.out.println(name + " не может пробежать больше 200 метров");
        }
    }

    public void swim(int distance) {
        System.out.println(name + " не умеет плавать");
    }

    public void eat(Bowl bowl) {
        if (!isFull && bowl.food >= 5) {
            bowl.decreaseFood(5);
            isFull = true;
            System.out.println(name + " поел(а)");
        } else if (!isFull) {
            System.out.println(name + " не смог(-ла) поесть. Еды не хватает :(");
        } else {
            System.out.println(name + " уже сыт :) ");
        }
    }
}

class Bowl {
    public int food;

    public Bowl(int food) {
        this.food = Math.max(food, 0);
    }

    public void addFood(int amount) {
        if (amount > 0) {
            food += amount;
        }
    }

    public void decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount;
        }
    }
}
