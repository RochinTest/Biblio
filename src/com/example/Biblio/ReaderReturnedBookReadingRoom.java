package com.example.Biblio;

public class ReaderReturnedBookReadingRoom implements Runnable {
    Biblio biblio;

    ReaderReturnedBookReadingRoom(Biblio biblio) {
        this.biblio = biblio;
    }

    public void run() {
        for (int i = 1; i < 10; i++) {
            biblio.setReadingRoomCountBook();
        }
    }
    static class ReaderReturnedBookHome implements Runnable {
        Biblio biblio;

        ReaderReturnedBookHome(Biblio biblio) {
            this.biblio = biblio;
        }

        public void run() {
            for (int i = 1; i < 10; i++) {
                biblio.setHomeCountBook();
            }
        }
    }
}
