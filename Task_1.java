public class Task_1 {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Сергей", "9876765434");
        phoneBook.add("Дмитрий", "9876442245");
        phoneBook.add("Дмитрий", "9464363123");
        phoneBook.add("Виктор", "9423543245");
        phoneBook.add("Сергей", "9213875465");
        phoneBook.add("Дмитрий", "9876442245");
        phoneBook.show();
        phoneBook.findNoteByNumber("9876442245");
        phoneBook.removeNumber("9876442245");
        phoneBook.showNote("Дмитрий");
        phoneBook.removeNote("Виктор");
        phoneBook.show();

    }
}