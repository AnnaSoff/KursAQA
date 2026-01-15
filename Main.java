public class Main {
        public static void main(String[] args) {
        String[][] correctArray = {
            {"1", "1", "1", "1"},
            {"2", "2", "2", "2"},
            {"3", "3", "3", "3"},
            {"4", "4", "4", "4"}
        };
        String[][] invalidSizeArray = {
            {"1","2"},
            {"3","3"},
            {"4","4"}
        };

        String[][] invalidArray= {
            {"1", "2", "3", "4"},
            {"5", "5", "7", "8"},
            {"9", "10", "@", "12"},
            {"13", "14", "15", "*"}
        };

        try {
            System.out.println("Сумма элементов: " + processArray(correctArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println(e.getMessage());
        }
        try {
            System.out.println("Сумма элементов: " + processArray(invalidSizeArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println(e.getMessage());
        }
        try {
            System.out.println("Сумма элементов: " + processArray(invalidArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println(e.getMessage());
        }
        try {
            System.out.println("Генерация и поимка ArrayIndexOutOfBoundsException:");
            int[] smallArray = new int[2];
            int element = smallArray[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Поймано исключение: " + e);
        }
    }

    public static int processArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != 4) {
            throw new MyArraySizeException("Массив должен быть размером 4x4");
        }
        for (String[] row : arr) {
            if (row.length != 4) {
                throw new MyArraySizeException("Массив должен быть размером 4x4");
            }
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}

class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }
}

class MyArrayDataException extends Exception {
    public MyArrayDataException(int row, int col) {
        super(String.format("Неверные данные в ячейке [%d][%d]", row, col));
    }
}