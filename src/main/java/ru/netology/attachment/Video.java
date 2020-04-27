package ru.netology.attachment;

import java.time.LocalDate;

public class Video {

    private int id;
    private int ownerId;
    private String title;
    private String description;
    private int duration;
    private String photo130;
    private String firstFrame130;
    private LocalDate date;
    private int views;
    private String comments;

    public Video(int id, int ownerId, String title, String description, int duration, String photo130, String firstFrame130, LocalDate date, int views, String comments) {
        this.id = id;
        this.ownerId = ownerId;
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.photo130 = photo130;
        this.firstFrame130 = firstFrame130;
        this.date = date;
        this.views = views;
        this.comments = comments;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getPhoto130() {
        return photo130;
    }

    public void setPhoto130(String photo130) {
        this.photo130 = photo130;
    }

    public String getFirstFrame130() {
        return firstFrame130;
    }

    public void setFirstFrame130(String firstFrame130) {
        this.firstFrame130 = firstFrame130;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
