package com.henriquemoreira.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.henriquemoreira.domain.Library;

@Repository
public interface LibraryRepository extends JpaRepository<Library, Integer> {

}