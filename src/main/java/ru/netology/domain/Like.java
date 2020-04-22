package ru.netology.domain;

public class Like {
    private int counter = 0;
    private boolean userLikes;

    public Like(int counter, boolean userLikes) {
        this.counter = counter;
        this.userLikes = userLikes;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public boolean isUserLikes() {
        return userLikes;
    }

    public void setUserLikes(boolean userLikes) {
        this.userLikes = userLikes;
    }
}
