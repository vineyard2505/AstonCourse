public class Main {
    public static void main(String[] args) {
        Task1.printThreeWords();
        Task2.checkSumSign();
        Task3.printColor();
        Task4.compareNumbers();
        System.out.println(Task5.checkSum(5,6));
        Task6.checkNumber(-7);
        System.out.println(Task7.checkNumberTrue(-8));
        Task8.writeStr("Aston", 3);
        int year = 2023;
        System.out.println(year + " is a leap year: " + Task9.highYear(year));
        Task10.changeNum();
        Task11.arrNumEmpty();
        Task12.arrMulti();
        Task13.arrTwo();
        int[] arr = Task14.createArr(5,10);
        for (int num : arr) {
            System.out.println(num);
        }
    }
}