package com.demo.urlshortener.controller;

import com.demo.urlshortener.entity.URLDetails;
import com.demo.urlshortener.service.URLShortenerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
public class URLShortenerController {

    @Autowired
    private URLShortenerServiceImpl urlShortenerService;

    @PostMapping(value = "/api/shorturl")
    public @ResponseBody String shortenURL(@RequestBody Map<String, String> url, HttpServletRequest request) {
        URLDetails urlDetails = this.urlShortenerService.shortenURL(url.get("url"));
        String responseUrl = request.getHeader("host") + "/api/shorturl/" + urlDetails.getId().toString();
        return responseUrl;
    }

    @GetMapping(value = "/api/shorturl/1")
    public String getShortenedURL() {
        return "https://www.example.com/1";
    }

}
