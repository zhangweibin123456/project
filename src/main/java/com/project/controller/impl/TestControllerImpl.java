package com.project.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.controller.TestController;
import com.project.model.TestVO;
import com.project.service.TestService;
import com.project.util.Msg;

@Controller
@RequestMapping(path = "/test")
public class TestControllerImpl implements TestController {

	@Autowired
	private TestService testService;

	@Override
	@ResponseBody
	@PostMapping("/findAll")
	public Msg findAll() {
		List<TestVO> voList = testService.findAll();
		return Msg.success().add(voList);
	}

	@Override
	@ResponseBody
	@PostMapping("/save")
	public Msg save(@RequestBody TestVO vo) {
		TestVO rvo = testService.save(vo);
		return Msg.success().add(rvo);
	}

	@Override
	@ResponseBody
	@PostMapping("/findOne")
	public Msg findOne(@RequestBody TestVO vo) {
		TestVO rvo = testService.findOne(vo.getId());
		return Msg.success().add(rvo);
	}

}
