/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19libary;

import entity.Book;
import java.util.Scanner;

/**
 *
 * @author user
 */
class App {
    public static void run (){
        System.out.println("--- Библиотека ---");
        boolean repeat = true ;
        do{
            System.out.println("Список задач");
            System.out.println("0. Выйти с программы");
            System.out.println("1. Добавить новую книгу");
            System.out.println("2. Посмотреть список кинг");
            System.out.println("3. Зарегистрировать нового читателя");
            System.out.println("4. Выдать книгу читателю");
            System.out.println("5. Вернуть книгу в библиотеку");
            Scanner scanner = new Scanner(System.in);
            String task = scanner.nextLine();
            switch (task) {
                 case "0":
                    System.out.println("--- Конец програмы ---");
                    repeat = false;
                    break;
                case "1":
                    System.out.println("--- Добавить новую книгу ---");
                    Book book = new Book("Voina i Mir", "L.Tolstoy",2010);
                    
                    break;
                case "2":
                    System.out.println("");
                    break;
                case "3":
                    System.out.println("");
                    break;
                case "4":
                    System.out.println("");
                    break;
                case "5":
                    System.out.println("");
                    break;
                default:
                    System.out.println("Нет такой задачи");
            }
        }while(repeat);
    }
}
