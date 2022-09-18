package com.demo.urlshortener.service;

import com.demo.urlshortener.entity.URLDetails;
import org.springframework.http.ResponseEntity;

import java.net.URISyntaxException;

public interface URLShortenerService {

    URLDetails shortenURL(String url);

    ResponseEntity<Object> redirectURL(Long urlId) throws URISyntaxException;

}
