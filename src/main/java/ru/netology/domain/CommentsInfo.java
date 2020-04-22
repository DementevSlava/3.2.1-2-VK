package ru.netology.domain;

public class CommentsInfo {
    private String text;
    private int count;
    private int canPost;

    public CommentsInfo(String text, int count, int canPost) {
        this.text = text;
        this.count = count;
        this.canPost = canPost;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCanPost() {
        return canPost;
    }

    public void setCanPost(int canPost) {
        this.canPost = canPost;
    }
}
