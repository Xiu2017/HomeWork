package com.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_stu")
public class Stu implements Serializable{

	private int sno;
	private String sname;
	
	//一个学生对应一个班级
	private Cls cls;
	
	public Stu() {
		super();
	}
	public Stu(int sno, String sname) {
		super();
		this.sno = sno;
		this.sname = sname;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	@ManyToOne
	@JoinColumn(name="scno")
	public Cls getCls() {
		return cls;
	}
	public void setCls(Cls cls) {
		this.cls = cls;
	}
}
