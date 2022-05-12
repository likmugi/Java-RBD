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
 * Задаем общедоступный класс Admin - наследник от Employee
 */
public class Engineer extends Employee{
    // Определяем конструктор класса с параметрами
    public Engineer(int empId, String name, String ssn, double salary) {
        // Вызываем конструктор супер класса, чтобы передать параметры вверх по иерархии
        super(empId, name, ssn, salary);
    }
    
}
