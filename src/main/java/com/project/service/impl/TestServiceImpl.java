package com.project.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.entity.TestPO;
import com.project.model.TestVO;
import com.project.repository.TestPepository;
import com.project.service.TestService;

@Service("testService")
public class TestServiceImpl implements TestService {

	@Autowired
	private TestPepository testPepository;

	@Override
	public List<TestVO> findAll() {
		List<TestVO> voList = new ArrayList<>();
		List<TestPO> poList = testPepository.findAll();
		if (poList != null) {
			for (TestPO po : poList) {
				voList.add(this.poToVo(po));
			}
		}
		return voList;
	}

	@Override
	public TestVO save(TestVO vo) {
		TestPO po = testPepository.save(this.voToPo(vo));
		return this.poToVo(po);
	}

	@Override
	public TestVO findOne(Long id) {
		TestPO po = testPepository.findOne(id);
		return this.poToVo(po);
	}

	private TestVO poToVo(TestPO po) {
		TestVO vo = new TestVO();
		vo.setId(po.getId());
		vo.setName(po.getName());
		return vo;
	}

	private TestPO voToPo(TestVO vo) {
		TestPO po = new TestPO();
		po.setId(vo.getId());
		po.setName(vo.getName());
		return po;
	}
}
