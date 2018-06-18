package ITMO.HWITMO.Library;

public class Enterance_to_lib {

    public static void main(String[] args) {

        Library library = new Library();

        Book kniga1 = new Book("Айн Ренд", "Титан расправил плечи", 500);
        Book kniga2 = new Book("Пушкин", "Белеет парус одинокий", 20);
        Book kniga3 = new Book("Гоголь", "Классика не горит", 300);
        Book kniga4 = new Book("Ломоносов", "Основы таблицы менделеева", 150);
        Book kniga5 = new Book("Теодор Дрейзер", "Финансист, Титан, Стоик", 900);

        library.put(kniga1, 150);
        library.put(kniga2, 80);
        library.put(kniga3, 24);
        library.put(kniga4, 19);
        library.put(kniga5, 281);
        System.out.println();

        library.get(kniga3, 62);
        library.get(kniga5, 300);
        library.get(kniga1, 90);
        library.get(kniga3, 24);
        library.get(kniga4, 77);
        library.get(kniga2, 11);
        library.get(kniga2, 99);







    }
}
