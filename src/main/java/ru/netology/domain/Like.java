package ru.netology.domain;

public class Like {
    private int counter = 0;

    public Like(int counter) {
        counter++;
        this.counter = counter;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
