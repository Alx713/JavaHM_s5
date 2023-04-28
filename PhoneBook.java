import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    Map<String, List<String>> book = new HashMap<>();
    
    void show(){
        System.out.println(book);
    }

    void add(String name, String phone){
        if (!doesNumberExist(phone)) {
            if (!book.containsKey(name)) {
                book.put(name, new ArrayList<>());
            }
                book.get(name).add(phone);    
        }else{
            System.out.println("Такой номер уже есть!");
        }
    }

    boolean doesNumberExist(String phone){
        for (String key : book.keySet()) {
            if (book.get(key).contains(phone)) {
                return true;
            }
        }
        return false;
    }

    void showNote(String name){
        if (book.containsKey(name)) {
            System.out.println(name + ": " + book.get(name));
        }else{
            System.out.println("Такого имени нет!");
        }
    }

    void findNoteByNumber(String phone){
        for (String key : book.keySet()) {
            if (book.get(key).contains(phone)) {
                showNote(key);
                return;
            }
        }
        System.out.println("Такого номера нет!");
    }

    void removeNote(String name){
        if (book.containsKey(name)) {
            book.remove(name);
        }else{
            System.out.println("Такого имени нет!");
        }
        
    }

    void removeNumber(String phone){
        for (String key : book.keySet()) {
            if (book.get(key).contains(phone)) {
                book.get(key).remove(phone);
                return;
            }
        }
        System.out.println("Такого номера нет!");
    }
}