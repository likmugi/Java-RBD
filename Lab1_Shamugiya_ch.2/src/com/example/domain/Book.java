/*
 * Этап 3. Создание приложения со своими классами и объектами.
 * Работа по вариантам.
 * Класс Book
 */
package com.example.domain;

/**
 *
 * @author scham
 */

/**
 * Задаем общедоступный класс Book
 */
public class Book {
    // Определяем поля данных (будущие атрибуты объекта)
    public int bookId;
    public String Title;
    public String author;
    // Прописываем геттеры и сетторы для полей
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    // Определяем пустой конструктор класса
    public Book(){}
}
