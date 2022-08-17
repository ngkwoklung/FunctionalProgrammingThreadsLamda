package org.example.concurreny;

public class ThreadBasics implements Runnable{ //Seperates the functionality from the thread

    @Override
    public void run() {
        System.out.println("I am printing from a thread");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadBasics());
        Thread thread2 = new Thread(() -> System.out.println("Do something"));
        thread.start();
    }
}
