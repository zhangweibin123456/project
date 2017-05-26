package com.project.controller;


import com.project.model.TestVO;
import com.project.util.Msg;

public interface TestController {

	public Msg findAll();
	
	public Msg save(TestVO vo);
	
	public Msg findOne(TestVO vo);
}
