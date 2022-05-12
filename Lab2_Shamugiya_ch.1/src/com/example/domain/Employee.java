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
 * Задаем общедоступный класс Employee
 */
public class Employee {
    // Определяем поля данных
    private int empId;
    private String name;
    private String ssn;
    private double salary;
    // Прописываем геттеры для всех полей и сеттер для поля Name
    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public double getSalary() {
        return salary;
    }
    // Добавляем метод увеличения зарплаты
    public void raiseSalary(double increase){
        if (increase > 0){
            salary += increase;
        }
    }
    // Определяем конструктор класса c параметрами
    public Employee(int empId, String name, String ssn, double salary) {
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }
}
