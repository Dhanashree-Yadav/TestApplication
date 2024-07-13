package com.springboot.practice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.practice.model.Provider;

@Repository
public interface ProviderRepo extends JpaRepository<Provider, String> {

	//List<Provider> findAllByIsblockFalse(String keyword);

}
