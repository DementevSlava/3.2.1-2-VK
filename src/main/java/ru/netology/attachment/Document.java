package ru.netology.attachment;

import java.time.LocalDate;

public class Document {

    private int id;
    private int ownerId;
    private String title;
    private int size;
    private String ext;
    private String url;
    private LocalDate date;
    private int type;

    public Document(int id, int ownerId, String title, int size, String ext, String url, LocalDate date, int type) {
        this.id = id;
        this.ownerId = ownerId;
        this.title = title;
        this.size = size;
        this.ext = ext;
        this.url = url;
        this.date = date;
        this.type = type;
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
