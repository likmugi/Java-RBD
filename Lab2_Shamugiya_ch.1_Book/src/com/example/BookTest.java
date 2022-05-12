/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;
// Импортируем все наши классы
import com.example.domain.Book;
import com.example.domain.Ebook;
import com.example.domain.Audiobook;
import com.example.domain.PaperBook;
import com.example.domain.SoftcoverBook;

/**
 *
 * @author scham
 */
public class BookTest {
    /**
     * В главном методе класса создаем по объекту каждого типа
     * Вызываем для каждого экземпляра метод printBook()
     */
    public static void main(String[] args) {
        
        Book bk = new Book(19308, "A Scandal in Bohemia", "Arthur Conan Doyle");
       
        Ebook ebk = new Ebook(3284, "The old curiosity shop", "Charles Dickens");
        
        Audiobook abk = new Audiobook(9830, "The headless horseman", "Mayne Reid");
        
        PaperBook pbk = new PaperBook(3838, "Carrie", "Stephen King", 800_000);
        
        SoftcoverBook scbk = new SoftcoverBook(674, "Pride and Prejudice", "Jane Austen", 1_000_000, "Mass-market");
        
        printBook(bk);
        printBook(ebk);
        printBook(abk);
        printBook(pbk);
        printBook(scbk);
    }
    /**
     * Выводим свойства объекта, указанного в качестве параметра.
     * Так как не все объекты имеют одинаковое количество полей, прежде чем вывести данные,
     * делаем проверку на принадлежность объекта к указанным дочерним классам.
     */
    private static void printBook(Book bk){
        System.out.println("Book ID: " + bk.getBookId());
        System.out.println("Book Title: " + bk.getTitle());
        System.out.println("Book Author: " + bk.getAuthor());
        if(bk instanceof PaperBook){
            System.out.println("Circulation of the book: " + ((PaperBook) bk).getCopies());
        }
        if(bk instanceof SoftcoverBook){
            System.out.println("Type of the book: " +((SoftcoverBook) bk).getType());
        }
    }
}
