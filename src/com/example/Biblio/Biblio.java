package com.example.Biblio;

public class Biblio {
    private int countBook;

    public Biblio(int countBook) {
        this.countBook = countBook;
    }

    public synchronized void getHomeCountBook() {
        while (countBook < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        countBook--;
        System.out.println("Читатель взял домой одну книгу");
        System.out.println("В библиотеке : " + countBook + " книг");
        notifyAll();

    }

    public synchronized void getReadingRoomCountBook() {
        while (countBook < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        countBook--;
        System.out.println("Читатель взял в читальный зал одну книгу");
        System.out.println("В библиотеке : " + countBook + " книг");
        notifyAll();

    }

    public synchronized void setHomeCountBook() {
        while (countBook >= 30) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        countBook++;
        System.out.println("Читатель вернул из дома одну книгу");
        System.out.println("В библиотеке : " + countBook + " книг");
        notifyAll();
    }

    public synchronized void setReadingRoomCountBook() {
        while (countBook >= 30) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        countBook++;
        System.out.println("Читатель вернул из читального зала одну книгу");
        System.out.println("В библиотеке : " + countBook + " книг");
        notifyAll();
    }

}

