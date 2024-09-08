import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TelephoneDirectory {
    private Map<String, List<String>> directoryPhone = new HashMap<>();
    private List<String> phoneNumber;

    public void add(String name, String phoneNum) {
        if (directoryPhone.containsKey(name)) {
            phoneNumber = directoryPhone.get(name);
            phoneNumber.add(phoneNum);
            directoryPhone.put(name, phoneNumber);
        } else {
            phoneNumber = new ArrayList<>();
            phoneNumber.add(phoneNum);
            directoryPhone.put(name, phoneNumber);
        }
    }

    public List<String> get(String name) {
        return directoryPhone.get(name);
    }
}
