//1)Написать клиент для работы библиотеки. В библиотеке доступны к чтению
// несколько книг. Некоторые из них можна выдавать на руки некоторые только
// в читальный зал. Посетители могут брать одновременно по несколько
// книг на руки и в читальный зал.
package com.example.Biblio;

public class Biblio {
    private int countBook;

    public Biblio(int countBook) {
        this.countBook = countBook;
    }

    public synchronized void getHomeCountBook() {
        while (countBook < 1) {
            try {
                wait(1000);
            } catch (InterruptedException e) {
            }
        }
        int count=(int) (Math.random()*3+1);
        countBook=countBook -count;
        if(countBook>=0){System.out.println("Читатель взял домой "+count+" книги");
            System.out.println("В библиотеке : " + countBook + " книг");}
        else { System.out.println(  "Пришёл читатель хочет взять"+count+" книги. В библиотеке нет столько книг придите позже!");
            countBook=countBook+count;
        }

        notify();

    }

    public synchronized void getReadingRoomCountBook() {
        while (countBook < 1) {
            try {
                wait(1000);
            } catch (InterruptedException e) {
            }
        }
        int count= (int) (Math.random()*3+1);
        countBook=countBook-count;
        if(countBook>=0){System.out.println("Читатель взял в читальный зал "+count+" книги");
            System.out.println("В библиотеке : " + countBook + " книг");}
        else { System.out.println(  "Пришёл читатель хочет взять"+count+" книги.В библиотеке нет столько книг придите позже!");
            countBook=countBook+count;
        }

        notify();

    }

    public synchronized void setHomeCountBook() {
        while (countBook >= 30) {
            try {
                wait(1000);
            } catch (InterruptedException e) {
            }
        }
        int count= (int) (Math.random()*3+1);
        countBook=countBook +count;
        System.out.println("Читатель вернул из дома "+count+" книги");
        System.out.println("В библиотеке : " + countBook + " книг");
        notify();
    }

    public synchronized void setReadingRoomCountBook() {
        while (countBook >= 30) {
            try {
                wait(1300);
            } catch (InterruptedException e) {
            }
        }
        int count= (int) (Math.random()*3+1);
        countBook=countBook +count;
        System.out.println("Читатель вернул из читального зала "+count+" книги");
        System.out.println("В библиотеке : " + countBook + " книг");
        notify();
    }

}

