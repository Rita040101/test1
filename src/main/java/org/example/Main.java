class Employee {
    private String fullName, position, email, phone;
    private int salary, age;

    public Employee(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println(fullName + ", " + position + ", " + email + ", " + phone + ", " + salary + ", " + age);
    }
}

class Park {
    class Attraction {
        private String name, workTime;
        private int price;

        public Attraction(String name, String workTime, int price) {
            this.name = name;
            this.workTime = workTime;
            this.price = price;
        }

        public void printInfo() {
            System.out.println(name + ", " + workTime + ", " + price);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Задача 2: Массив сотрудников
        Employee[] employees = {
                new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30),
                new Employee("Petrov Petr", "Manager", "petrov@mailbox.com", "892312313", 40000, 45),
                new Employee("Sidorov Sidr", "Director", "sidorov@mailbox.com", "892312314", 70000, 50),
                new Employee("Smirnov Ivan", "Analyst", "smirnov@mailbox.com", "892312315", 50000, 28),
                new Employee("Kuznetsov Alex", "Developer", "kuznetsov@mailbox.com", "892312316", 45000, 35)
        };

        System.out.println("Сотрудники:");
        for (Employee employee : employees) employee.printInfo();

        // Задача 3: Аттракционы
        Park park = new Park();
        Park.Attraction rollerCoaster = park.new Attraction("Roller Coaster", "10:00 - 22:00", 500);
        Park.Attraction ferrisWheel = park.new Attraction("Ferris Wheel", "09:00 - 21:00", 300);

        System.out.println("\nАттракционы:");
        rollerCoaster.printInfo();
        ferrisWheel.printInfo();
    }
}
