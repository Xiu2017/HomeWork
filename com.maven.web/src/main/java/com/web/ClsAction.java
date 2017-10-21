package com.web;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.entity.Cls;
import com.opensymphony.xwork2.ActionContext;
import com.service.ClsService;

@Controller("clsAction")
@Scope("prototype")
public class ClsAction {

	//注入clsService
	@Resource(name="clsService")
	private ClsService clsService;
	
	private Cls cls;
	private int res;
	
	//增
	public String addCls() {
		if(clsService.addCls(cls)) {
			res = 1;
		}else {
			res = -1;
		}
		return "addpage";
	}
	
	//删
	public String delCls() {
		if(clsService.delCls(cls)) {
			res = 1;
		}else {
			res = -1;
		}
		return "backcls";
	}
	
	//改
	public String updCls() {
		if(clsService.updCls(cls)) {
			res = 1;
		}else {
			res = -1;
		}
		return "updpage";
	}
	
	//查所有
	public String selCls() {
		ActionContext.getContext().put("clsList", clsService.selCls());
		return "clspage";
	}
	
	//查单个
	public String selClsById() {
		cls = clsService.selClsById(cls);
		return "toupd";
	}
	
	public void setClsService(ClsService clsService) {
		this.clsService = clsService;
	}
	public int getRes() {
		return res;
	}
	public void setRes(int res) {
		this.res = res;
	}
	public void setCls(Cls cls) {
		this.cls = cls;
	}
	public Cls getCls() {
		return cls;
	}
}
