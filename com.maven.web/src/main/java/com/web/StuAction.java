package com.web;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.entity.Stu;
import com.opensymphony.xwork2.ActionContext;
import com.service.ClsService;
import com.service.StuService;

@Controller("stuAction")
@Scope("prototype")
public class StuAction {

	//注入stuService
	@Resource(name="stuService")
	private StuService stuService;
	//注入clsService
	@Resource(name="clsService")
	private ClsService clsService;
	
	private Stu stu;
	private int res;
	
	//增
	public String addStu() {
		if(stuService.addStu(stu)) {
			res = 1;
		}else {
			res = -1;
		}
		return "addpage";
	}
	
	//删
	public String delStu() {
		if(stuService.delStu(stu)) {
			res = 1;
		}else {
			res = -1;
		}
		return "backstu";
	}
	
	//改
	public String updStu() {
		if(stuService.updStu(stu)) {
			res = 1;
		}else {
			res = -1;
		}
		return "updpage";
	}
	
	//查所有
	public String selStu() {
		ActionContext.getContext().put("stuList", stuService.selStu());
		return "stupage";
	}
	
	//查单个
	public String selStuById() {
		stu = stuService.selClsById(stu);
		ActionContext.getContext().put("clsList", clsService.selCls());
		return "toupd";
	}
	
	public Stu getStu() {
		return stu;
	}
	public void setStu(Stu stu) {
		this.stu = stu;
	}
	public int getRes() {
		return res;
	}
	public void setRes(int res) {
		this.res = res;
	}
	public void setStuService(StuService stuService) {
		this.stuService = stuService;
	}
	public void setClsService(ClsService clsService) {
		this.clsService = clsService;
	}
}
