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
 * Задаем общедоступный абстрактный класс
 */
public abstract class Animal {
    // Определяем поле с видимостью пакетного уровня
    protected int legs;
    // Определяем конструктор с параметром и видимостью пакетного уровня
    protected Animal(int legs) {
        this.legs = legs;
    }
    
    public void walk(){
        System.out.println("Это животное гуляет на " + legs + " ногах.");
    }
    // Задаем абстрактный метод
    public abstract void eat();
}
