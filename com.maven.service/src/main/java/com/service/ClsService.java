package com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dao.ClsDao;
import com.entity.Cls;

@Service("clsService")
@Transactional(propagation=Propagation.REQUIRED)
public class ClsService {

	//注入clsDao
	@Resource(name="clsDao")
	private ClsDao clsDao;
	
	//增
	public boolean addCls(Cls cls) {
		return clsDao.addCls(cls);
	}
	
	//删
	public boolean delCls(Cls cls) {
		return clsDao.delCls(cls);
	}
	
	//改
	public boolean updCls(Cls cls) {
		return clsDao.updCls(cls);
	}
	
	//查所有
	public List selCls() {
		String hql = "from Cls";
		return clsDao.selCls(hql);
	}
	
	//查单个
	public Cls selClsById(Cls cls) {
		return clsDao.selClsById(cls);
	}

	public void setClsDao(ClsDao clsDao) {
		this.clsDao = clsDao;
	}
}
