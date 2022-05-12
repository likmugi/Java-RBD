/*
 * Лабораторная 3. Вариант 2. Пример 1.
 * Выполнила: Шамугия Л.Г., ИВТ-М-2020
 */
package lab3_2_1;
// Прописываем, что импортируем три класса из пакета java.io
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lab3_2_Shamugiya_1 {

    public static void main(String[] args) {
        // Создадим две ссылки
        FileWriter myfile;
        FileReader myfile2;
        // Так как объекты при работе могут создавать ошибки, то используется конструкция try-catch
        try {
        // Запись информации в файл
            // Вызываем конструктор для нового объекта и таким образом создаем новый текстовый файл 
            myfile = new FileWriter("data.txt");
            // При помощи метода write() передаем поток символов в файл
            myfile.write("Obojdi ves' belij svet - nashej gruppi lichshe net");
            // И закрываем наш файл
            myfile.close();
        // Чтение
            // Теперь мы создаем новый объект, поиск файла осуществляется JVM в той же папке
            myfile2 = new FileReader("data.txt");
            // Создаем буфер, где будем хранить информацию, считанную из файла
            char buf[] = new char[80];
            // С помощью метода read() читаем информацию из потока и записываем её в буфер
            myfile2.read(buf);
            System.out.println(buf);
            myfile2.close();
        } catch (IOException ex) { 
            // При возникновении исключений, будет выведена строка
            System.out.println("IOException");
        }
    }
    
}

