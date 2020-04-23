package com.springrest.BooksByAgatha.service;

import com.springrest.BooksByAgatha.model.Title;

import java.util.List;

public interface TitleServiceImpl {

    //CREATE
    public Title createTitle();


    //READ
    public List<Title> getAllTitles();
    public List<Title> getAll();
    public Title getTitle(int id);

    //UPDATE


    //DELETE
}
