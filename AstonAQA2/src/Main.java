public class Main {
    public static void main(String[] args) {
        //1
        printThreeWords();
        //2
        checkSumSign();
        //3
        printColor();
        //4
        compareNumbers();
        //5
        isSumInRange(10, 5);
        //6
        printIsPositive(1);
        //7
        System.out.println(isNegative(0));
        //8
        printIsString("Привет мир!", 7);
        //9
        System.out.println(isLeapYear(100));
        //10
        int[] Array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        flipBinaryArray(Array);
        //11
        int[] nums = new int[100];
        fillArrayValues(nums);
        //12
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        modifyArrayValues(array, 6);
        //13
        int[][] mass = new int[10][10];
        fillDiagonalOnes(mass);
        //14
        createIntArray(5, 10);

    }


    public static void printThreeWords() {
        System.out.println("\nЗадание 1:");
        System.out.println("Orange\nBanana\nApple");
    }

    public static void checkSumSign() {
        System.out.println("\nЗадание 2:");
        int a, b, c;
        a = 6;
        b = 0;
        c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");

        } else {
            System.out.println("Сумма  отрицательная");
        }

    }


    public static void printColor() {
        System.out.println("\nЗадание 3:");
        int value = 101;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }

    }


    public static void compareNumbers() {
        System.out.println("\nЗадание 4:");
        int a, b;
        a = 0;
        b = 0;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }



    public static void isSumInRange(int a, int b) {
        System.out.println("\nЗадание 5:");
        int c = a + b;
        System.out.println(c >= 10 && c <= 20);
    }


    public static void printIsPositive(int number) {
        System.out.println("\nЗадание 6:");
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean isNegative(int number) {
        System.out.println("\nЗадание 7:");
        return number < 0;
    }


    public static void printIsString(String str, int a) {
        System.out.println("\nЗадание 8:");
        for (int i = 0; i < a; i++) {
            System.out.println(str);

        }
    }



    public static boolean isLeapYear(int year) {
        System.out.println("\nЗадание 9:");
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }


    public static void flipBinaryArray(int[] args) {
        System.out.println("\nЗадание 10:");
        for (int i = 0; i < args.length; i++) {
            if (args[i] == 0) {
                args[i] = 1;
            } else {
                args[i] = 0;
            }
            System.out.print((args[i]) + " ");
        }
    }


    public static void fillArrayValues(int[] array) {
        System.out.println("\n\nЗадание 11:");
        for (int i = 0; i < array.length; i++) {
            System.out.print((array[i] = i) + " ");
        }
    }



    public static void modifyArrayValues(int[] array, int count) {
        System.out.println("\n\nЗадание 12:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] < count) {
                System.out.print((array[i] *= 2) + " ");
            } else {
                System.out.print((array[i]) + " ");
            }
        }

    }


    public static void fillDiagonalOnes(int[][] array) {
        System.out.println("\n\nЗадание 13:");
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static int[] createIntArray(int len, int initialValue) {
        System.out.println("\nЗадание 14:");
        int[] newArr = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.print(newArr[i] = initialValue);
        }
        return newArr;
    }


}