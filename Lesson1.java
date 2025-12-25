import java.util.Arrays;
public class Lesson1 {
    public static void printThreeWords() {
        System.out.println("Orange"); 
        System.out.println("Banana"); 
        System.out.println("Apple");  
    }
        public static void checkSumSign() {
            int a = 24;
            int b = 25;
            int c = a + b;
            if (c>0) {
                System.out.println("Сумма положительная");
            }else{
                System.out.println("Сумма отрицательная");
            }
        }
    public static void printColor() {
        int value = 10;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 100) {
             System.out.println("Зеленый");
        }else{
            System.out.println("Желтый");
        }
    }
    public static void compareNumbers() {
        int a = 24;
        int b = 29;
        if (a >= b) {
            System.out.println("a >= b");
        }else{
            System.out.println("a < b");
        }
    }
    public static void sumNumbers() {
        int a = 4;
        int b = 9;
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    public static void numbers() {
        int a = -4;
        if (a >= 0) {
            System.out.println("Положительное");
        }else{
            System.out.println("Отрицательное");
        }
    }
    public static void numbers2() {
        int a = -4;
        if (a >= 0) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }
    public static void strNum() {
        int a = 4;
        for (int i = 0; i < a; i++) {
            System.out.println("Java Forever");
        }
    }
    public static void years() {
        int year = 2024;
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    public static void integerArray() {
        int [] arr = {1,1,0,0,1,0,1,1,0,0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                System.out.print(0);
            } else {
                System.out.print(1);
            }
        }
        System.out.println();
    }
    public static void array() {
        int[] array = new int[101];
        for (int i = 1; i <= 100; i++) {
            array[i] = i + 1;
            System.out.print(i+ " ");
        }
        System.out.println();
    }
    public static void array2() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
    }
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
    public static void array3() {
        int size = 5;
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            array[i][i] = 1;
            array[i][size - 1 - i] = 1;
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len]; 
        Arrays.fill(arr, initialValue); 
        return arr;
    }
    public static void main(String[] args) {
        printThreeWords(); 
        checkSumSign();
        printColor();
        compareNumbers();
        sumNumbers();
        numbers();
        numbers2();
        strNum();
        years();
        integerArray();
        array();
        array2();
        array3();
        int[] myArray = createArray(4, 4); 
        System.out.println(Arrays.toString(myArray));
    }
}

