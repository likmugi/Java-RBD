/*
 * Лабораторная 3. Вариант 2. Пример 2.
 * Выполнила: Шамугия Л.Г., ИВТ-М-2020
 */
package lab3_2_2;
// Прописываем, что импортируем четыре класса из пакета java.io
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ByteArrayInputStream;

public class Lab3_2_Shamugiya_2 {
    
    public static void main (String[] args){
        // Создадим две ссылки (из прошлой работы, нужно удалить)
        FileWriter myfile;
        FileReader myfile2;
        // Так как объекты при работе могут создавать ошибки, то используется конструкция try-catch
        //try {
            // Создаем байтовый массив
            byte[] bytes = {13,3,93};
            // Создаем ссылку, которая связывается с объектом 
            ByteArrayInputStream in = new ByteArrayInputStream(bytes);
            // Создаем число и читаем данные из потока при помощи метода read()
            int readedInt = in.read(); // readedInt = 13
            System.out.println("Первый элемент: " + readedInt);
            readedInt = in.read();
            System.out.println("Второй элемент: " + readedInt);
            readedInt = in.read(); // readedInt = 93
            System.out.println("Третий элемент: " + readedInt);
        //} catch (IOException ex) { 
            // При возникновении исключений, будет выведена строка
        //    System.out.println("IOException");
        //}
    }
}
