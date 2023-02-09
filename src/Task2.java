import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*
Пусть дан список сотрудников:
Иван Иванов,
Светлана Петрова,
Кристина Белова,
Анна Мусина,
Анна Крутова,
Иван Юрин,
Петр Лыков,
Павел Чернов,
Петр Чернышов,
Мария Федорова,
Марина Светлова,
Мария Савина,
Мария Рыкова,
Марина Лугова,
Анна Владимирова,
Иван Мечников,
Петр Петин,
Иван Ежов.
Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.
 */
public class Task2 {
    public static void main(String[] args) {
        String people = "Иван Иванов " +
                "Светлана Петрова " +
                "Кристина Белова " +
                "Анна Мусина " +
                "Анна Крутова " +
                "Иван Юрин " +
                "Петр Лыков " +
                "Павел Чернов " +
                "Петр Чернышов " +
                "Мария Федорова " +
                "Марина Светлова " +
                "Мария Савина " +
                "Мария Рыкова " +
                "Марина Лугова " +
                "Анна Владимирова " +
                "Иван Мечников " +
                "Петр Петин " +
                "Иван Ежов ";

        sortNames(people);
    }
        static void sortNames(String incString){
        Map<String, Integer> namesMap = new HashMap<>();
        String[] namesList = incString.split(" ");
        for (int i = 0; i < namesList.length; i += 2) {
            if (namesMap.containsKey(namesList[i])) {
                namesMap.replace(namesList[i], namesMap.get(namesList[i]) + 1);
            } else {
                namesMap.put(namesList[i], 1);
            }
        }
        System.out.println(namesMap);
        Map<String, Integer> sortedNameMap = new LinkedHashMap<>();
        int max = 1;
        for (int value : namesMap.values()) {
            if (value > max) {
                max = value;
            }
        }
        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : namesMap.entrySet()) {
                String key = entry.getKey();
                if (namesMap.get(key) == i) {
                    sortedNameMap.put(key, namesMap.get(key));
                }
            }
        }
        System.out.println(sortedNameMap);
    }
}
