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
 * Задаем класс Cat - наследует от Animal и имплементирует Pet
 */
public class Cat extends Animal implements Pet{
    // Определяем поле
    private String name;
    // Определяем конструктор класса с параметром
    public Cat(String name){
        // Вызываем конструктор супер класса, чтобы передать параметры вверх по иерархии
        super(4);
        this.name = name;
    }
    // Определяем еще один конструктор класса
    public Cat(){
        this("Мурка");
    }
    //Переопределяем абстрактные методы
    @Override
    public String getName(){
        return name;
    }
    
    @Override
    public void eat(){
        System.out.println("Кошки людят есть пауков и рыбок");
    }
    
    @Override
    public void setName(String name){
        this.name = name;
    }
    
    @Override
    public void play(){
        System.out.println(name + " любит играть с веревочкой");
    }
}
