package com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.entity.Stu;

@Repository("stuDao")
public class StuDao extends BaseDao{

	//增
	public boolean addStu(Stu stu){
		try {
			getSession().save(stu);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	//删
	public boolean delStu(Stu stu){
		try {
			getSession().delete(stu);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	//改
	public boolean updStu(Stu stu){
		try {
			getSession().update(stu);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	//查所有
	public List selStu(String hql) {
		return getSession().createQuery(hql).list();
	}
	
	//查单个
	public Stu selStuById(Stu stu) {
		return getSession().get(stu.getClass(), stu.getSno());
	}
}
