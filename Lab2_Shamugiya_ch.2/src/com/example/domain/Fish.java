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
 * Задаем класс Fish - наследует от Animal и имплементирует Pet
 */
public class Fish extends Animal implements Pet{
    // Определяем поле
    private String name;
    // Определяем конструктор класса
    public Fish(){
        // Вызываем конструктор супер класса, чтобы передать параметры вверх по иерархии
        super(0);
    }
    
    //Переопределяем абстрактные методы
    @Override
    public void setName(String name){
        this.name = name;
    }
    
    @Override
    public String getName(){
        return name;
    }
    
    @Override
    public void play(){
        System.out.println("Рыбка просто плавает");
    }

    @Override
    public void walk(){
        System.out.println("Рыбки, конечно, гулять не могут - они плавают.");
    }
    
    @Override
    public void eat(){
        System.out.println("Рыбки едят червков");
    }
    
    
}
