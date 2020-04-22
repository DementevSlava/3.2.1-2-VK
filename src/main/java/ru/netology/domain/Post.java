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
}
