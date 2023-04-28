import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Task_2 {
    public static void main(String[] args) {
        String workers = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, " +
                "Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, " +
                "Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, " +
                "Иван Мечников, Петр Петин, Иван Ежов.";
        workers.replace(".", "");
        
        String[] array = workers.split(", ");
        List<String> names = new ArrayList<>();
        List<Integer> freq = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            String name = array[i].split(" ")[0];
            if (names.contains(name)) {
                int index = names.indexOf(name);
                freq.set(index, freq.get(index) + 1);
            } else {
                names.add(name);
                freq.add(1);
            }
        }

        Map<Integer, List<String>> map = new TreeMap<>();

        for (int i = 0; i < names.size(); i++) {
            if (map.containsKey(freq.get(i))) {
                List<String> list = map.get(freq.get(i));
                list.add(names.get(i));
            } else {
                List<String> list = new ArrayList<>();
                list.add(names.get(i));
                map.put(freq.get(i), list);
            }

        }

        System.out.println(map);
    }
}