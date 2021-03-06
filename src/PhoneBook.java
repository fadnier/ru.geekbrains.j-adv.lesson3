import java.lang.reflect.Array;
import java.util.*;

public class PhoneBook {
    private Map<String, Set<String>> listPhone = new HashMap<>();

    public PhoneBook() {
    }

    public PhoneBook(Map<String, Set<String>> listPhone) {
        this.listPhone = listPhone;
    }

    public void get(String fio) {
        System.out.println(listPhone.get(fio));
    }

    public void add(String fio, String numberPhone) {
        Set<String> phoneList = listPhone.getOrDefault(fio, new HashSet<>(Arrays.asList(numberPhone)));
        phoneList.addAll(new HashSet<>(Arrays.asList(numberPhone)));
        listPhone.put(fio, phoneList);
    }
}
