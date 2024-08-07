public class Task9 {
    public static boolean highYear(int year){
        if (year % 4 == 0){
            if (year % 100 == 0){
                return year % 400==0;
            }
            return true;
        }
        return false;
    }
}
