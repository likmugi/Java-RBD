/*
 * Лабораторная 3. Вариант 2. Пример 3.
 * Выполнила: Шамугия Л.Г., ИВТ-М-2020
 */
package lab3_2_3;
// Прописываем, что импортируем четыре класса из пакета java.io
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class Lab3_2_Shamugiya_3 { 
    
    public static void main(String[] args) throws IOException{
        // Объект DataOutputStream в конструкторе принимает поток вывода. Здесь таким потоком выступает объект FileOutputStream
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("fib.txt"));
        int a = 1, b = 1, c = 1;
        // Проприсываем цикл, который считает числа Фибоначчи
        for (int k = 0; k < 40; k++){
            System.out.print(b + " ");
            dos.writeInt(b); // записываем полученное число в файл
            a = b; b = c; c = a + b;
        }
        dos.close();
        System.out.println("\n");
        // Объект DataInputStream в конструкторе принимает поток для чтения. Здесь таким потоком выступает объект FileInputStream
        DataInputStream dis = new DataInputStream(new FileInputStream("fib.txt"));
        while (true)
        try{
            a = dis.readInt(); // считываем число из потока
            System.out.print(a + " ");
        } catch(IOException e){
            // При обработке исключения, мы закрываем поток ввода, а затем и программу 
            dis.close();
            System.out.println("End of file");
            System.exit(0);
        }
    }
}
