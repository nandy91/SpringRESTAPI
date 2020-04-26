package com.springrest.BooksByAgatha.repository;

import com.springrest.BooksByAgatha.model.Title;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TitleRepository extends PagingAndSortingRepository<Title,Integer> {
    //public Iterable<Title> findBySeries(String series);
}
