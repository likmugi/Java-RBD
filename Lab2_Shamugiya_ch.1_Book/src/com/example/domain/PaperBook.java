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
 * Задаем общедоступный класс PaperBook - наследник от Book
 */
public class PaperBook extends Book{
    // Добавляем поле 
    private int copies;
    // Определяем конструктор с параметрами, учитывая новое поле
    public PaperBook(int bookId, String Title, String author, int copies) {
        // Вызываем конструктор супер класса, чтобы передать параметры вверх по иерархии
        super(bookId, Title, author);
        this.copies = copies;
    }
    // Прописываем геттер для нового поля
    public int getCopies() {
        return copies;
    }
    
}
