package ru.netology.domain;

public class CommentsInfo {
    private String text;
    private int count;
    private boolean canPost;
    private boolean canClose;
    private boolean canOpen;

    public CommentsInfo(String text, int count, boolean canPost, boolean canClose, boolean canOpen) {
        this.text = text;
        this.count = count;
        this.canPost = canPost;
        this.canClose = canClose;
        this.canOpen = canOpen;
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

    public boolean isCanPost() {
        return canPost;
    }

    public boolean isCanClose() {
        return canClose;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

    public boolean isCanOpen() {
        return canOpen;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }
}
