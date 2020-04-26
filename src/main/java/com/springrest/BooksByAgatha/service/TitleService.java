package com.springrest.BooksByAgatha.service;

import com.springrest.BooksByAgatha.model.Title;
import com.springrest.BooksByAgatha.repository.TitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
@Service
public class TitleService implements TitleServiceImpl {
    @Autowired
    private TitleRepository titleRepository;


//    @Override
//    public Iterable<Title> getBySeries(String series) {
//        return titleRepository.findBySeries(series);
//    }
    @Override
    public Optional<Title> getTitle(int id) {
        return titleRepository.findById(id);
    }
    @Override
    public Iterable<Title> getAllTitles() {
        return titleRepository.findAll();
    }
    @Override
    public Title createTitle(Title title) {
        return titleRepository.save(title);
    }
}
