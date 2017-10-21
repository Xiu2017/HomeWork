package com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dao.StuDao;
import com.entity.Stu;

@Service("stuService")
@Transactional(propagation=Propagation.REQUIRED)
public class StuService {

	//注入clsDao
	@Resource(name="stuDao")
	private StuDao stuDao;
	
	//增
	public boolean addStu(Stu stu) {
		return stuDao.addStu(stu);
	}
	
	//删
	public boolean delStu(Stu stu) {
		return stuDao.delStu(stu);
	}
	
	//改
	public boolean updStu(Stu stu) {
		return stuDao.updStu(stu);
	}
	
	//查所有
	public List selStu() {
		String hql = "from Stu s left join s.cls";
		return stuDao.selStu(hql);
	}
	
	//查单个
	public Stu selClsById(Stu stu) {
		return stuDao.selStuById(stu);
	}
}
