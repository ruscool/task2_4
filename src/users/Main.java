package users;

import library.Book;

// Класс Main для проверки работоспособности программы
public class Main {
    public static void main(String[] args) {
        // Создание экземпляра книги
        Book book = new Book("Java программирование");

        // Вызов метода checkOut для установки borrower
        book.checkOut("Иван Петров");
    }
}