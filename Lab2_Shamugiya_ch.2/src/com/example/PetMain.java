/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;
// Импортируем все наши классы
import com.example.domain.Cat;
import com.example.domain.Fish;
import com.example.domain.Spider;
import com.example.domain.Animal;
import com.example.domain.Pet;
import com.example.domain.Turtle;

/**
 *
 * @author scham
 */
public class PetMain {

    /**
     * В главном методе мы создаем экземпляры наших классов
     * Проверяем поведение объектов при помощи вызова их методов
     * Кроме того, вызываем для всех наследников метод playWithAnimal()
     */
    public static void main(String[] args) {
        Animal a;
        Spider s = new Spider();
        s.walk();
        s.eat();
        playWithAnimal(s);
        
        Cat c = new Cat("Том");
        c.walk();
        c.eat();
        c.play();
        playWithAnimal(c);
        
        a = new Cat();
        a.walk();
        a.eat();
        
        Pet p;
        p = new Cat();
        p.setName("Mr. Whiskers");
        p.play();
        
        Fish f = new Fish();
        f.setName("Гуппи");
        f.walk();
        f.eat();
        f.play();
        playWithAnimal(f);
        
        a = new Fish();
        a.walk();
        a.eat();
        
        Turtle t = new Turtle();
        t.walk();
        t.eat();
        t.setName("Micaella");
        t.play();
    }
    // Метод позволит определить принадлежность объекта к типу Pet, в противном случае выведет на консоль сообщение
    public static void playWithAnimal(Animal a){
        if (a instanceof Pet){
            Pet p = (Pet) a;
            p.play();
        }
        else {
            System.out.println("Опасно, дикое животное");
        }
    }
}
