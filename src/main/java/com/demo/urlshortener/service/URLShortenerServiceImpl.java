package com.demo.urlshortener.service;

import com.demo.urlshortener.entity.URLDetails;
import com.demo.urlshortener.repository.URLDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.URISyntaxException;

@Service
public class URLShortenerServiceImpl implements URLShortenerService {

    @Autowired
    URLDetailsRepository urlDetailsRepository;

    @Override
    public URLDetails shortenURL(String url) {
        URLDetails urlDetails = new URLDetails();
        urlDetails.setUrl(url);
        return this.urlDetailsRepository.save(urlDetails);
    }

    @Override
    public ResponseEntity<Object> redirectURL(Long urlId) throws URISyntaxException {
        URLDetails url = this.urlDetailsRepository.findUrlById(urlId);
        URI uri = new URI(url.getUrl());
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setLocation(uri);
        return new ResponseEntity<>(httpHeaders, HttpStatus.SEE_OTHER);
    }

}
