/*
 * Этап 1. Создание приложения со своими классами и объектами.
 * Работа по методическому материалу
 * Класс Employee
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
    public int empId;
    public String name;
    public String ssn;
    public double salary;
    // Прописываем геттеры и сетторы для полей
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    // Определяем пустой конструктор класса
    public Employee(){        
    }
}
