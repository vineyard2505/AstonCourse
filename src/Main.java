public class Main {
    public static void main(String[] args) {
        //printThreeWords();
        //checkSumSign();
        //printColor();
        //compareNumbers();
        //System.out.println(checkSum(5,6));
        //checkNumber(-7);
        //System.out.println(checkNumberTrue(-8));

    }
    //Задание 1
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    //Задание 2
    public static void checkSumSign(){
        int a = 10;
        int b = 12;
        int sum = a + b;
        if (sum >= 0){
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    //Задание 3
    public static void printColor(){
        int value = 200;
        if (value <= 0){
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    //Задание 4
    public static void compareNumbers(){
        int a = 10;
        int b = 12;
        if(a >= b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    //Задание 5
    public static boolean checkSum(int oneNum, int twoNum){
        int sum = oneNum + twoNum;
        return sum >= 10 && sum <= 20;
    }
    //Задание 6
    public static void checkNumber(int a){
        if(a <= 0){
            System.out.println("Отрицательное");
        } else {
            System.out.println("Положительное");
        }
    }
    //Задание 7
    public static boolean checkNumberTrue(int num){
        return num<0;
    }
}