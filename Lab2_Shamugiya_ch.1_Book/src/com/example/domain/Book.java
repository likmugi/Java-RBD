/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.domain;

/**
 *
 * @author scham
 */

/**
 * Задаем общедоступный класс Employee
 */
public class Book {
    // Определяем поля данных
    private int bookId;
    private String Title;
    private String author;
    // Прописываем геттеры для всех полей и сеттер для поля Title
    public int getBookId() {
        return bookId;
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
    // Определяем конструктор класса c параметрами
    public Book(int bookId, String Title, String author) {
        this.bookId = bookId;
        this.Title = Title;
        this.author = author;
    }

}
