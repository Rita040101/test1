package org.example;

class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }
}

class MyArrayDataException extends Exception {
    public MyArrayDataException(String message) {
        super(message);
    }
}

public class Main {
    public static int processArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Массив должен быть размером 4x4");
        }

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Ошибка в ячейке [" + i + "][" + j + "]: значение \"" + array[i][j] + "\"");
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        String[][] validArray = {
                {"5", "4", "17", "2"},
                {"32", "6", "16", "20"},
                {"9", "11", "9", "18"},
                {"23", "10", "1", "8"}
        };

        String[][] invalidSizeArray = {
                {"11", "12", "13"},
                {"14", "15", "16"},
                {"17", "18", "19"}
        };

        String[][] invalidDataArray = {
                {"8", "12", "3", "15"},
                {"25", "19", "7", "три"},
                {"9", "14", "31", "2"},
                {"53", "4", "30", "6"}
        };

        try {
            System.out.println("Сумма элементов массива: " + processArray(validArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            System.out.println("Сумма элементов массива: " + processArray(invalidSizeArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            System.out.println("Сумма элементов массива: " + processArray(invalidDataArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
