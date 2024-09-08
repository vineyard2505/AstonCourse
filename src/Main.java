import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    private static void task1() {
        String[] words = {"Taty", "Taty", "Snow", "Snow", "Main", "Bag", "Stop", "Head", "Hello", "World", "Name"};
        Set<String> wordsSet = new HashSet<>(Arrays.asList(words));
        System.out.println(wordsSet);
        List<String> wordsList = new ArrayList<>(Arrays.asList(words));
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : wordsList) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static void task2(){
        TelephoneDirectory telDirectory = new TelephoneDirectory();
        telDirectory.add("Vinogradova", "+375333351327");
        telDirectory.add("Sergeeva", "+375298855000");
        telDirectory.add("Kuzuk", "+375290055777");
        telDirectory.add("Sergeeva", "+375298899111");

        System.out.println(telDirectory.get("Vinogradova"));
        System.out.println(telDirectory.get("Sergeeva"));
    }
}