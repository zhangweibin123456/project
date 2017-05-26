package com.project.service;

import java.util.List;

import com.project.model.TestVO;

public interface TestService {

	public List<TestVO> findAll();
	
	public TestVO save(TestVO vo);
	
	public TestVO findOne(Long id);
}
