package ru.netology.domain;

import java.time.LocalDate;

public class Post {

    private int id;
    private String OwnerId;
    private int fromId;
    private int created_by;
    private LocalDate date;
    private String text;
    private String pictureUrl;
    private int like;
    private CommentsInfo commentsInfo;
    private String share;
    private int view;
    private int counter = 0;
    private Geo geo;

    public Post(int id, String ownerId, int fromId, int created_by, LocalDate date, String text, String pictureUrl,
                int like, CommentsInfo commentsInfo, String share, int view, int counter, Geo geo) {
        this.id = id;
        OwnerId = ownerId;
        this.fromId = fromId;
        this.created_by = created_by;
        this.date = date;
        this.text = text;
        this.pictureUrl = pictureUrl;
        this.like = like;
        this.commentsInfo = commentsInfo;
        this.share = share;
        this.view = view;
        this.counter = counter;
        this.geo = geo;
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

    public int getFromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public int getCreated_by() {
        return created_by;
    }

    public void setCreated_by(int created_by) {
        this.created_by = created_by;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }
}


