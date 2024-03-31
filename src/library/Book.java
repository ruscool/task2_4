package library;

public class Book extends LibraryItem {
    // Конструктор класса Book
    public Book(String title) {
        // Вызов конструктора суперкласса
        super(title);
    }

    // Метод checkOut для установки borrower (того, кто взял книгу) в библиотеке
    public void checkOut(String borrower) {
        this.borrower = borrower;
        System.out.println("Книга \"" + title + "\" была взята: " + borrower);
    }
}
