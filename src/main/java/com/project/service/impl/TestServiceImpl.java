package com.project.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.project.entity.TestPO;
import com.project.model.Page;
import com.project.repository.TestPepository;
import com.project.service.TestService;




@Service("testService")
public class TestServiceImpl implements TestService {

	@Autowired
	private TestPepository testPepository;

	@Override
	public List<TestPO> findAll(Page page) {
		List<TestPO> list = new ArrayList<>();
		Pageable pager = new PageRequest(page.getPage() - 1, page.getPageSize(), new Sort(Sort.Direction.ASC, "testid"));
		list = testPepository.findAll(pager).getContent();
		return list;
	}

	@Override
	public Long count() {
		Long count = testPepository.count();
		return count;
	}

	@Override
	public List<TestPO> findAll() {
		List<TestPO> list = new ArrayList<>();
		list = testPepository.findAll(new Sort(Sort.Direction.ASC, "testid"));
		return list;
	}

}
