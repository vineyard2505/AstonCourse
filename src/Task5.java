public class Task5 {
    public static boolean checkSum(int oneNum, int twoNum){
        int sum = oneNum + twoNum;
        if(sum >= 10 && sum <= 20){
            return true;
        }
        return false;
    }
}
