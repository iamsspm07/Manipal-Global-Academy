package org.sujitmaity.ExceptionHandling.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="studentEntity")
public class StudentEntity {
	@Id
	@Column(name="stdId")
	 Integer stdId;
	
	@Column(name="stdName")
	 String stdName;
	
	@Column(name="stdDept")
	 String stdDept;
	
	@Column(name="stdNumber")
	 long stdNumber;

	
	public StudentEntity(Integer stdId, String stdName, String stdDept, long stdNumber) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdDept = stdDept;
		this.stdNumber = stdNumber;
	}


	public StudentEntity() {
		super();
	}


	public Integer getStdId() {
		return stdId;
	}


	public void setStdId(Integer stdId) {
		this.stdId = stdId;
	}


	public String getStdName() {
		return stdName;
	}


	public void setStdName(String stdName) {
		this.stdName = stdName;
	}


	public String getStdDept() {
		return stdDept;
	}


	public void setStdDept(String stdDept) {
		this.stdDept = stdDept;
	}


	public long getStdNumber() {
		return stdNumber;
	}


	public void setStdNumber(long stdNumber) {
		this.stdNumber = stdNumber;
	}


	@Override
	public String toString() {
		return "StudentEntity [stdId=" + stdId + ", stdName=" + stdName + ", stdDept=" + stdDept + ", stdNumber="
				+ stdNumber + "]";
	}
	
	




}
