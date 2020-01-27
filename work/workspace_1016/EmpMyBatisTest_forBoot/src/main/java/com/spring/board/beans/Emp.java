package com.spring.board.beans;

import java.sql.Date;
import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

public class Emp {
	
	@NotNull @Range(min = 1, max = 4) 
	private int empNo;
	
	@NotNull @Length(min = 1, max = 10)
	private String eName;

	@NotBlank
	private String job;
	
	@Range(min = 1, max = 4) 
	private int mgr;
	
	@NotNull 
	private Date hiredate;
	
	@NotNull
	private String hiredateStr;

	@NotNull @Min(value = 1)
	private int sal;
	private int comm;
	
	private List<Integer> empnoList;
	
	
	List<Emp> emps;
	public Emp() {
	}
	
	
	public List<Emp> getEmps() {
		return emps;
	}
	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getComm() {
		return comm;
	}
	public void setComm(int comm) {
		this.comm = comm;
	}


	public String getHiredateStr() {
		return hiredateStr;
	}


	public void setHiredateStr(String hiredateStr) {
		this.hiredateStr = hiredateStr;
	}


	public List<Integer> getEmpnoList() {
		return empnoList;
	}


	public void setEmpnoList(List<Integer> empnoList) {
		this.empnoList = empnoList;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + comm;
		result = prime * result + ((eName == null) ? 0 : eName.hashCode());
		result = prime * result + empNo;
		result = prime * result + ((empnoList == null) ? 0 : empnoList.hashCode());
		result = prime * result + ((emps == null) ? 0 : emps.hashCode());
		result = prime * result + ((hiredate == null) ? 0 : hiredate.hashCode());
		result = prime * result + ((hiredateStr == null) ? 0 : hiredateStr.hashCode());
		result = prime * result + ((job == null) ? 0 : job.hashCode());
		result = prime * result + mgr;
		result = prime * result + sal;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (comm != other.comm)
			return false;
		if (eName == null) {
			if (other.eName != null)
				return false;
		} else if (!eName.equals(other.eName))
			return false;
		if (empNo != other.empNo)
			return false;
		if (empnoList == null) {
			if (other.empnoList != null)
				return false;
		} else if (!empnoList.equals(other.empnoList))
			return false;
		if (emps == null) {
			if (other.emps != null)
				return false;
		} else if (!emps.equals(other.emps))
			return false;
		if (hiredate == null) {
			if (other.hiredate != null)
				return false;
		} else if (!hiredate.equals(other.hiredate))
			return false;
		if (hiredateStr == null) {
			if (other.hiredateStr != null)
				return false;
		} else if (!hiredateStr.equals(other.hiredateStr))
			return false;
		if (job == null) {
			if (other.job != null)
				return false;
		} else if (!job.equals(other.job))
			return false;
		if (mgr != other.mgr)
			return false;
		if (sal != other.sal)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Emp [empNo=" + empNo + ", eName=" + eName + ", job=" + job + ", mgr=" + mgr + ", hiredate=" + hiredate
				+ ", hiredateStr=" + hiredateStr + ", sal=" + sal + ", comm=" + comm + "]";
	}

	
}
