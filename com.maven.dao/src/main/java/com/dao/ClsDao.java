package com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.entity.Cls;

@Repository("clsDao")
public class ClsDao extends BaseDao{

	//增
	public boolean addCls(Cls cls){
		try {
			getSession().save(cls);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	//删
	public boolean delCls(Cls cls){
		try {
			getSession().delete(cls);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	//改
	public boolean updCls(Cls cls){
		try {
			getSession().update(cls);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	//查所有
	public List selCls(String hql) {
		return getSession().createQuery(hql).list();
	}
	
	//查单个
	public Cls selClsById(Cls cls) {
		return getSession().get(cls.getClass(), cls.getCno());
	}
}
