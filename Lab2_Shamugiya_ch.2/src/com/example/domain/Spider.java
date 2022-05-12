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
public class Spider extends Animal {
    // Определяем конструктор класса
    public Spider() {
        // Вызываем конструктор супер класса, чтобы передать параметры вверх по иерархии
        super(8);
    }
    //Так как метод eat() - абстрактный, то нам необходимо переопределить метод 
    @Override
    public void eat(){
        System.out.println("Паук ест мух");
    }
}
