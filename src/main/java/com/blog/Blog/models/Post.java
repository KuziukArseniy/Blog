package com.blog.Blog.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity //обозначение класса как таблица в БД
public class Post {
    @Id //уникальный идентификатор (jakarta.persistence.Id)
    @GeneratedValue(strategy = GenerationType.AUTO) //генерация нового значения при добавлении нового id
    private Long id; //для уникальных идентификаторов всегда тип Long, так принято

    private String title, anons, full_text;
    private int views;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAnons() {
        return anons;
    }

    public void setAnons(String anons) {
        this.anons = anons;
    }

    public String getFull_text() {
        return full_text;
    }

    public void setFull_text(String full_text) {
        this.full_text = full_text;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }
}
