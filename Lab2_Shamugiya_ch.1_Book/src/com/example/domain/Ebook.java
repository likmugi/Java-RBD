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
 * Задаем общедоступный класс Ebook - наследник от Book
 */
public class Ebook extends Book{
    // Определяем конструктор класса с параметрами
    public Ebook(int bookId, String Title, String author) {
        // Вызываем конструктор супер класса, чтобы передать параметры вверх по иерархии
        super(bookId, Title, author);
    }
    
}
