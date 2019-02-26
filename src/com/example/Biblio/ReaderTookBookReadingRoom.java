package com.example.Biblio;

public class ReaderTookBookReadingRoom implements Runnable {
    Biblio biblio;

    ReaderTookBookReadingRoom(Biblio biblio) {
        this.biblio = biblio;
    }

    public void run() {
        for (int i = 1; i < 10; i++) {
            biblio.getReadingRoomCountBook();
        }
    }

    static class ReaderTookBookHome implements Runnable {
        Biblio biblio;

        ReaderTookBookHome(Biblio biblio) {
            this.biblio = biblio;
        }

        public void run() {
            for (int i = 1; i < 10; i++) {
                biblio.getHomeCountBook();
            }
        }
    }
}