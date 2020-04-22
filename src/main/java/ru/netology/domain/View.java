package ru.netology.domain;

public class View {
    private int counter = 0;

    public View(int counter) {
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
