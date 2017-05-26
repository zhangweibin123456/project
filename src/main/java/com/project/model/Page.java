package com.project.model;

public class Page {

	private Integer page;

	private Integer pageSize;

	private String orderType;

	private String orderASCorDESC;

	public Page() {

	}
	public Page(Integer page, Integer pageSize) {
		super();
		this.page = page;
		this.pageSize = pageSize;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOrderASCorDESC() {
		return orderASCorDESC;
	}

	public void setOrderASCorDESC(String orderASCorDESC) {
		this.orderASCorDESC = orderASCorDESC;
	}

	public Page(Integer page, Integer pageSize, String orderType, String orderASCorDESC) {
		this.page = page;
		this.pageSize = pageSize;
		this.orderType = orderType;
		this.orderASCorDESC = orderASCorDESC;
	}

}
