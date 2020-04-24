package com.springrest.BooksByAgatha.service;

import com.springrest.BooksByAgatha.model.Title;

import java.util.List;
import java.util.Optional;

public interface TitleServiceImpl {

    //CREATE
    public Title createTitle(Title title);

    //READ
    public Iterable<Title> getAllTitles();
    //public Iterable<Title> getBySeries(String series);
    public Optional<Title> getTitle(int id);

    //UPDATE
    //public Title updateTitle(Title updatedTitle);

    //DELETE
    //public boolean deleteTitle(int id);
}
