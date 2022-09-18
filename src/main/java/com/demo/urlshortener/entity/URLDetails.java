package com.demo.urlshortener.entity;

import javax.persistence.*;

@Entity(name = "url_details")
public class URLDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "url_id")
    private Long id;

    @Column(name = "url")
    private String url;

    public URLDetails() {

    }

    public URLDetails(Long id, String url) {
        this.id = id;
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
