package com.springrest.BooksByAgatha.controller;

import com.springrest.BooksByAgatha.model.Title;
import com.springrest.BooksByAgatha.service.TitleService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.awt.*;
import java.net.URI;
import java.util.Collection;

@RestController
@RequestMapping("/")

public class TitleController {
    @Autowired
    private TitleService titleService;

    @PostMapping("/titles")
    @Operation(description = "Create a new title of Agatha Christie", responses = {
            @ApiResponse(content = @Content(schema = @Schema(implementation = Title.class)), responseCode = "201")})
    public ResponseEntity<Title> newTitle(@RequestBody Title title, UriComponentsBuilder ucb) {
        Title newTitle = titleService.createTitle(title);
        URI locationUri =
                ucb.path("/titles/")
                        .path(String.valueOf(newTitle.getId()))
                        .build()
                        .toUri();
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(locationUri);
        return new ResponseEntity<Title>(newTitle,headers, HttpStatus.CREATED);
    }

    @GetMapping("/titles")
    @Operation(description = "Returns all available Titles of Agatha Christie", responses = {
            @ApiResponse(content = @Content(schema = @Schema(implementation = Title.class)), responseCode = "200")})
    public ResponseEntity<Iterable<Title>> getTitles() {
        Iterable<Title> titles = titleService.getAllTitles();

        return new ResponseEntity<Iterable<Title>>(titles,HttpStatus.OK);
    }

}
