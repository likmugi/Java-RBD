/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;
// Импортируем все наши классы
import com.example.domain.Employee;
import com.example.domain.Admin;
import com.example.domain.Director;
import com.example.domain.Manager;
import com.example.domain.Engineer;

/**
 *
 * @author scham
 */
public class EmployeeTest {    
    /**
     * В главном методе класса создаем по объекту каждого типа
     * Вызываем для каждого экземпляра метод printEmployee()
     */
    public static void main(String[] args) {
        
        Employee emp = new Employee(101, "Jane Smith","012-34-5678", 120_345.27);
        
        Engineer eng = new Engineer(231, "Mark Norton", "043-85-901", 140_394.32);
        
        Manager mgr = new Manager(207, "Barbara Jhonson", "384-23-4289", 109_342.36, "US Marketing");
        
        Admin adm = new Admin(304, "Bill Munroe", "108-23-3424", 85_023.34);
        
        Director dir = new Director(15, "Samanta Tomson", "294-04-571", 160_564.63, "Global Marketing", 1_000_000.00);
        
        printEmployee(emp);
        printEmployee(eng);
        printEmployee(mgr);
        printEmployee(adm);
        printEmployee(dir);
    }

    /**
     * Выводим свойства объекта, указанного в качестве параметра.
     * Так как не все объекты имеют одинаковое количество полей, прежде чем вывести данные,
     * делаем проверку на принадлежность объекта к указанным дочерним классам.
     */
    private static void printEmployee(Employee emp){
        System.out.println("Employee ID: " + emp.getEmpId());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Soc Sec #: " + emp.getSsn());
        System.out.println("Employee Salary: " + emp.getSalary());
        if(emp instanceof Manager){
            System.out.println("Employee Department: " + ((Manager) emp).getDeptName());
        }
        if(emp instanceof Director){
            System.out.println("Employee Department: " + ((Director) emp).getBudget());
        }
        
    }
}
