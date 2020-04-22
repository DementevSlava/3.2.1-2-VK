package ru.netology.domain;

public class Share {
    private int counter = 0;
    private boolean canPost;

    public Share(int counter, boolean canPost) {
        this.counter = counter;
        this.canPost = canPost;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public boolean isCanPost() {
        return canPost;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }
}
