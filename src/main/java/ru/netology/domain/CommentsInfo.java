package ru.netology.domain;

public class CommentsInfo {
    private String text;
    private int count;
    private boolean canPost;

    public CommentsInfo(String text, int count, boolean canPost) {
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

    public boolean getCanPost() {
        return canPost;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }
}
