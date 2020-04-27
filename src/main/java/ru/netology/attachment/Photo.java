package ru.netology.attachment;

import java.time.LocalDate;

public class Photo {

    private int id;
    private int albumId;
    private int ownerId;
    private int userId;
    private String text;
    private LocalDate date;
    private int width;
    private int height;

    public Photo(int id, int albumId, int ownerId, int userId, String text, LocalDate date, int width, int height) {
        this.id = id;
        this.albumId = albumId;
        this.ownerId = ownerId;
        this.userId = userId;
        this.text = text;
        this.date = date;
        this.width = width;
        this.height = height;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
