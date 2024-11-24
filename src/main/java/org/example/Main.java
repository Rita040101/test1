package org.example;
//1

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        }
        public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
}


//2
public class Main {
    public static void main(String[] args){
        checkSumSign();
    }
    public static void checkSumSign() {
        int a = 19;
        int b = -9;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }
}


//3
public class Main {
    public static void printColor() {
        int value = 69;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100 ) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }

    }
    public static void main(String[] args) {
        printColor();
    }
}

//4
public class Main {
    public static void compareNumbers() {
        int a = 102;
        int b = 85;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    public static void main(String[] args) {
        compareNumbers();
    }
}

//5
public class Main {
    public static boolean sumrange ( int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
        public static void main(String[] args) {
        System.out.println(sumrange (9, 15));
        System.out.println(sumrange(8,21));
        System.out.println(sumrange(13,2));
        }
}

//6
public class Main {
    public static void checknum (int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отричательное");
        }
    }
    public static void main(String[] args) {
        checknum(0);
        checknum(18);
        checknum(-42);
    }
}

//7
public class Main {
    public static boolean negativenumber (int number) {
        return number < 0;
    }
    public static void main(String[] args) {
        System.out.println(negativenumber(57));
        System.out.println(negativenumber(0));
        System.out.println(negativenumber(-33));
    }
}

//8
public class Main {
    public static void printrepeat (String text, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(text);
        }
    }
    public static void main(String[] args) {
        printrepeat("ASTON AQA", 11);
    }
}

//9
public class Main {
    public static boolean leapyear (int year) {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
        }
        public static void main(String[] args) {
        int year = 2025;
        if (leapyear(year)) {
            System.out.println("Год"+ year + "является високосным.");
        } else {
            System.out.println("Год"+ year + "не является високосным.");
        }
    }

}

//10
public class Main {
    public static void main(String[] args) {
        int[] array = {1,1,1,1,0,1,0,0,1,0};
        System.out.print("Данный массив: ");
        for (int num : array) {
            System.out.print(num + "");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0;
        }
        System.out.print("Новый массив: ");
        for (int num : array) {
            System.out.print(num + "");
        }
    }
}

//11
public class Main {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.print("Заполненный массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
//12
public class Main {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print("Данный массив: ");
        for (int num : array) {
            System.out.print( num + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        System.out.print("Новый массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

//13
public class Main {
    public static void main(String[] args) {
        int n = 9;
        int [][] array = new int [n][n];
        for (int i = 0; i < n; i++) {
            array [i][i] = 1;
            array [i][n - i - 1] = 1;
        }
        System.out.println("Массив с двумя диагоналями: ");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                System.out.print(array [i][j] + " ");
            }
            System.out.println();
        }
    }
}

//14

public class Main {
    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
    public static void main(String[] args) {
        int [] array = createArray(8,167);
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}


