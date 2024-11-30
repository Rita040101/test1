class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, String phone, int salary, int age) {
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
class Park {
    class Attraction {
        private String name;
        private String workTime;
        private int price;

        public Attraction(String name, String workTime, int price) {
            this.name = name;
            this.workTime = workTime;
            this.price = price;
        }
        public void printInfo() {
            System.out.println("Аттракцион: " + name + ", Время работы: " + workTime + ", Стоимость: " + price);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Иванов Иван", "Инженер", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Employee("Петрова Алла", "Директор", "petrova@mailbox.com", "897894083", 80000, 43);
        persArray[2] = new Employee("Бобров Павел", "Менеджер", "bobrov@mailbox.com", "895673892", 20000, 27);
        persArray[3] = new Employee("Сомойлов Леонид", "Аналитик", "somoylov@mailbox.com", "890092847", 40000, 29);
        persArray[4] = new Employee("Масляк Игорь", "Разработчик", "maslyak@mailbox.com", "892209578", 45000, 33);

        System.out.println("Информация о сотрудниках:");
        for (Employee employee : persArray) {
            employee.printInfo();
        }

        Park park = new Park();
        Park.Attraction rollerCoaster = park.new Attraction("Американские горки", "12:00 - 19:00", 15);
        Park.Attraction bigWheel = park.new Attraction("Колесо обозрения", "13:00 - 20:00", 20);

        System.out.println("\nИнформация об аттракционах:");
        rollerCoaster.printInfo();
        bigWheel.printInfo();
    }
}
