package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.project.entity.TestPO;

public interface TestPepository extends JpaRepository<TestPO, Long>, JpaSpecificationExecutor<TestPO> {

	
}
