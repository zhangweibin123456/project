package com.project.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.controller.TestController;
import com.project.entity.TestPO;
import com.project.model.Page;
import com.project.service.TestService;
import com.project.util.Msg;

@Controller
@RequestMapping(path = "/test")
public class TestControllerImpl implements TestController {

	@Autowired
	private TestService testService;

	@Override
	@ResponseBody
	@RequestMapping("/findAllByPage")
	public Msg findAll(Page page) {
		return Msg.fail();
	}

	@Override
	@ResponseBody
	@RequestMapping("/findAll")
	public Msg findAll() {
		List<TestPO> poList = testService.findAll();
		return Msg.success().add(poList);
	}

	@Override
	@ResponseBody
	@RequestMapping("/count")
	public Msg count() {
		return null;
	}

	@Override
	@ResponseBody
	@RequestMapping("/findOne")
	public Msg findOne() {
		TestPO po= testService.findOne(1l);
		return Msg.success().add(po);
	}

}
