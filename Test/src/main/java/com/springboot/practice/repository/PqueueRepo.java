package com.springboot.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.practice.model.Pqueue;

@Repository
public interface PqueueRepo extends JpaRepository<Pqueue,String> {

	Pqueue findBySid(String sid);

}
