package ITMO.HWITMO.Library;

public class Library {
    int i = 0;

       public void put(Book book, int quantity) {
        if (i <= 1000 && quantity <= 1000) {
            i += quantity;
            book.counter += quantity;
            System.out.println("В библиотеке имеется  " + book.counter + " штук " + book.author + " " + book.title);
        } else System.out.println("Извините, библиотека заполнена");

    }

    public int get(Book book, int quantity) {
        if (i > 0 && quantity <= book.counter) {
            i -= quantity;
            book.counter -= quantity;
            System.out.println("В библиотеке осталось " + book.counter + " штук " + book.author + " " + book.title);
        } else System.out.println("Извните, у нас нет столько " + book.author + " " + book.title);
        return quantity;
    }


}