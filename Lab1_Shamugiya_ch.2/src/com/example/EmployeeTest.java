/*
 * Этап 2. Создание приложения со своими классами и объектами.
 * Работа по методическому материалу
 * Тестовый класс
 */
package com.example;
import com.example.domain.Employee; // импортируем наш класс Employee

/**
 *
 * @author scham
 */
public class EmployeeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Создаем новый объект типа Employee с помощью конструктора Employee() и прописываем параметры объекта        
        Employee emp = new Employee();
        emp.setEmpId(101);
        emp.setName("Jane Smith");
        emp.setSalary(12_345.27);
        emp.setSsn("012-34-5678");
        // Выводим на консоль параметры созданного объекта с подсказками
        System.out.println("Employee ID: " + emp.getEmpId());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Soc Sec #: " + emp.getSsn());
        System.out.println("Employee salary: " + emp.getSalary());
    }
    
}
