package com.example.studentlms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private String stdregno;
	private String stname;
	private int stage;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStdregno() {
		return stdregno;
	}
	public void setStdregno(String stdregno) {
		this.stdregno = stdregno;
	}
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	public int getStage() {
		return stage;
	}
	public void setStage(int stage) {
		this.stage = stage;
	}
	
	


}
