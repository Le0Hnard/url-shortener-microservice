package com.demo.urlshortener.repository;

import com.demo.urlshortener.entity.URLDetails;
import org.springframework.data.repository.CrudRepository;

public interface URLDetailsRepository extends CrudRepository<URLDetails, Long> {

    URLDetails findUrlById(Long id);

}
