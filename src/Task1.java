/*
Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
 */
import java.util.*;
public class Task1 {
    public static void main(String[] args) {
        phoneBook();
    }
    static void phoneBook(){
        Map<String, String> map = new HashMap<>();
        map.put("+7-999-888-77-66", "Иванов");
        map.put("+7-555-222-33-48", "Петров");
        map.put("+7-928-567-12-13", "Сидоров");
        map.put("+7-568-567-44-33", "Иванов");
        map.put("+7-678-678-78-78", "Петров");
        map.put("+7-789-678-67-67", "Сидоров");

        for (Map.Entry entry: map.entrySet()){
            if (entry.getValue().equals("Иванов")){
                System.out.println(entry);
            }
        }
    }
}