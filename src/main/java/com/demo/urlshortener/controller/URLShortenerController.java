package com.demo.urlshortener.controller;

import com.demo.urlshortener.service.URLShortenerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class URLShortenerController {

    @Autowired
    private URLShortenerService urlShortenerService;

    @PostMapping(value = "/api/shorturl")
    public Map<String, String> shortenURL() {
        return urlShortenerService.shortenURL();
    }

    @GetMapping(value = "/api/shorturl/1")
    public String getShortenedURL() {
        return "https://www.example.com/1";
    }

}
