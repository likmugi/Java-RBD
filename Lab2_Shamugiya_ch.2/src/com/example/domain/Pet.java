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
 * Задаем интерфейс
 */
public interface Pet {
    //Прописываем поле и абстрактные методы
    public String getName();
    public void setName(String name);
    public void play();
}
