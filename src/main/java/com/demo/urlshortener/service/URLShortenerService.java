package com.demo.urlshortener.service;

import com.demo.urlshortener.entity.URLDetails;

public interface URLShortenerService {

    URLDetails shortenURL(String url);

}
