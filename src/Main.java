import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //DZ1
        String[] arrayString = new String[] {"cоздать","массив","набор","слов","найти","вывести","список","уникальных","слов","массив","слов"};
        Map<String,Integer> mapString = new HashMap<>();
        for (int i = 0; i < arrayString.length ; i++) {
            mapString.put(arrayString[i], mapString.getOrDefault(arrayString[i],0)+1);
        }
        System.out.println(mapString);

        //DZ2
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Василий","8611-222-11-33");
        phoneBook.add("Василий","8611-222-11-44");
        phoneBook.add("Василий","8611-222-11-33");
        phoneBook.add("Ольга","8611-332-11-33");
        phoneBook.get("Василий");
    }
}
