package com.demo.urlshortener.service;

import com.demo.urlshortener.entity.URLDetails;
import com.demo.urlshortener.repository.URLDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
