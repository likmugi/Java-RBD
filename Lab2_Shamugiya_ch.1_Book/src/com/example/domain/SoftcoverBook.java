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
 * Задаем общедоступный класс SoftcoverBook - наследник от PaperBook
 */
public class SoftcoverBook extends PaperBook{
    // Добавляем поле
    private String type;
    // Определяем конструктор с параметрами, учитывая новое поле
    public SoftcoverBook(int bookId, String Title, String author, int copies, String type) {
        // Вызываем конструктор супер класса, чтобы передать параметры вверх по иерархии
        super(bookId, Title, author, copies);
        this.type = type;
    }
    // Прописываем геттер для нового поля
    public String getType() {
        return type;
    }
    
}
