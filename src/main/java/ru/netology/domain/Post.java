package ru.netology.domain;

import java.time.LocalDate;

public class Post {

    private int id;
    private String ownerId;
    private int fromId;
    private int createdBy;
    private LocalDate date;
    private String text;
    private String pictureUrl;
    private Like like;
    private CommentsInfo commentsInfo;
    private Share share;
    private View view;
    private int counter = 0;
    private Geo geo;
    private int canPin;
    private int canDelete;
    private int canEdit;
    private int isPinned;
    private int markedAsAds;
    private boolean isFavorite;
    private int postponedId;

    public Post(int id, String ownerId, int fromId, int createdBy, LocalDate date, String text, String pictureUrl, Like like, CommentsInfo commentsInfo, Share share, View view, int counter, Geo geo, int can_pin, int can_delete, int can_edit, int is_pinned, int marked_as_ads, boolean is_favorite, int postponed_id) {
        this.id = id;
        this.ownerId = ownerId;
        this.fromId = fromId;
        this.createdBy = createdBy;
        this.date = date;
        this.text = text;
        this.pictureUrl = pictureUrl;
        this.like = like;
        this.commentsInfo = commentsInfo;
        this.share = share;
        this.view = view;
        this.counter = counter;
        this.geo = geo;
        this.canPin = can_pin;
        this.canDelete = can_delete;
        this.canEdit = can_edit;
        this.isPinned = is_pinned;
        this.markedAsAds = marked_as_ads;
        this.isFavorite = is_favorite;
        this.postponedId = postponed_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
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

    public Like getLike() {
        return like;
    }

    public void setLike(Like like) {
        this.like = like;
    }

    public Share getShare() {
        return share;
    }

    public void setShare(Share share) {
        this.share = share;
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

    public int getFromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
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

    public int getCanPin() {
        return canPin;
    }

    public void setCanPin(int canPin) {
        this.canPin = canPin;
    }

    public int getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(int canDelete) {
        this.canDelete = canDelete;
    }

    public int getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(int canEdit) {
        this.canEdit = canEdit;
    }

    public int getIsPinned() {
        return isPinned;
    }

    public void setIsPinned(int isPinned) {
        this.isPinned = isPinned;
    }

    public int getMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(int markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public int getPostponedId() {
        return postponedId;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }
}


