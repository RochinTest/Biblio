package com.example.Biblio;

public class Main {
    public static void main(String[] args) {
        Biblio bstore = new Biblio(4);
      ReaderReturnedBookReadingRoom.ReaderReturnedBookHome homeReader = new ReaderReturnedBookReadingRoom.ReaderReturnedBookHome(bstore);
        ReaderTookBookReadingRoom.ReaderTookBookHome homeReader1= new ReaderTookBookReadingRoom.ReaderTookBookHome(bstore);
        ReaderReturnedBookReadingRoom producer = new ReaderReturnedBookReadingRoom(bstore);
        ReaderTookBookReadingRoom consumer = new ReaderTookBookReadingRoom(bstore);

        new Thread(producer).start();
        new Thread(consumer).start();
        new Thread(homeReader).start();
        new Thread(homeReader1).start();
    }
}
