public class Main {
    public static void main(String[] args) {
        String[][] arrTrue = {
                {"1", "1", "1", "1"},
                {"2", "2", "2", "2"},
                {"3", "3", "3", "3"},
                {"4", "4", "4", "4"}
        };
        String[][] arrFalseSize = {
                {"1", "1", "1"},
                {"2", "2", "2"},
                {"3", "3", "3"}
        };
        String[][] arrFalseData = {
                {"1", "one", "1", "1"},
                {"2", "2", "2", "2"},
                {"3", "3", "3", "3"},
                {"4", "4", "4", "4"}
        };

        try {
            int sum = verificationArr(arrTrue);
            System.out.println("Сумма элементов массива: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println(e.getMessage());
        }
        try {
            int sum = verificationArr(arrFalseSize);
            System.out.println("Сумма элементов массива: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println(e.getMessage());
        }
        try {
            int sum = verificationArr(arrFalseData);
            System.out.println("Сумма элементов массива: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println(e.getMessage());
        }
    }

    public static int verificationArr(String[][] array) {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Неверный размер массива");
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверный тип данных в ячейке [" + i + "][" + j + "]: '" + array[i][j] + "'");
                }
            }
        }
        return sum;
    }
}
