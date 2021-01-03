package com.correioch.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.correioch.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{
	

}
