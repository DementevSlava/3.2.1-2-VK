package ru.netology.domain;

import java.time.LocalDate;

public class Post {

    private int id;
    private String OwnerId;
    private LocalDate date;
    private String text;
    private String pictureUrl;
    private int like;
    private CommentsInfo comments;
    private String share;
    private int view;
    private int counter = 0;

    public Post(int id, String ownerId, LocalDate date, String text, String pictureUrl, int like, CommentsInfo comments, String share, int view, int counter) {
        this.id = id;
        OwnerId = ownerId;
        this.date = date;
        this.text = text;
        this.pictureUrl = pictureUrl;
        this.like = like;
        this.comments = comments;
        this.share = share;
        this.view = view;
        this.counter = counter;
        counter++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOwnerId() {
        return OwnerId;
    }

    public void setOwnerId(String ownerId) {
        OwnerId = ownerId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public CommentsInfo getComments() {
        return comments;
    }

    public void setComments(CommentsInfo comments) {
        this.comments = comments;
    }

    public String getShare() {
        return share;
    }

    public void setShare(String share) {
        this.share = share;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }
}


