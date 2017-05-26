package com.project.controller;


import com.project.model.Page;
import com.project.util.Msg;


public interface TestController {

	public Msg findAll(Page page);
	
	public Msg findAll();
	
	public Msg count();
}
