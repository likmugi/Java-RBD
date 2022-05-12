/*
 * Этап 4. Создание приложения со своими классами и объектами.
 * Работа по вариантам.
 * Тестовый класс
 */
package com.example;
import com.example.domain.Book; // импортируем наш класс Book

/**
 *
 * @author scham
 */
public class BookTest {
    
    public static void main(String[] args) {
        // Создаем новый объект типа Book с помощью конструктора Book() и прописываем параметры объекта
        Book bk = new Book();
        bk.setBookId(19308);
        bk.setTitle("A Scandal in Bohemia");
        bk.setAuthor("Arthur Conan Doyle");
        // Выводим на консоль параметры созданного объекта с подсказками
        System.out.println("Book ID: " + bk.getBookId());
        System.out.println("Book Title: " + bk.getTitle());
        System.out.println("Author of the book: " + bk.getAuthor());
        
    }
}
