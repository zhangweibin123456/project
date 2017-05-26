package com.project.service;

import java.util.List;

import com.project.entity.TestPO;
import com.project.model.Page;


public interface TestService {

	public List<TestPO> findAll(Page page);
	
	public List<TestPO> findAll();
	
	public Long count();
	
	public TestPO save(TestPO po);
	
	public TestPO findOne(Long id);
}
