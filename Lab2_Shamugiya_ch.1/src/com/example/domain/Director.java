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
 * Задаем общедоступный класс Director - наследник от Manager
 */
public class Director extends Manager{
    // Добавляем поле
    private double budget;
    // Определяем конструктор с параметрами, учитывая новое поле
    public Director(int empId, String name, String ssn, double salary, String deptName, double budget) {
        // Вызываем конструктор супер класса, чтобы передать параметры вверх по иерархии
        super(empId, name, ssn, salary, deptName);
        this.budget = budget;
    }
    // Прописываем геттер для нового поля
    public double getBudget() {
        return budget;
    }
    
}
