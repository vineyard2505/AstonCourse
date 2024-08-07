public class Task10 {
    public static void changeNum(){
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i=0; i < arr.length; i++){
            if (arr[i] == 0){
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
