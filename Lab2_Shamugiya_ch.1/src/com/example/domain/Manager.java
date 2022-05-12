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
 * Задаем общедоступный класс Manager - наследник от Employee
 */
public class Manager extends Employee {
    // Добавляем поле 
    private String deptName;
    // Определяем конструктор с параметрами, учитывая новое поле
    public Manager(int empId, String name, String ssn, double salary, String deptName) {
        // Вызываем конструктор супер класса, чтобы передать параметры вверх по иерархии
        super(empId, name, ssn, salary);
        this.deptName = deptName;
    }
    // Прописываем геттер для нового поля
    public String getDeptName() {
        return deptName;
    }
}
