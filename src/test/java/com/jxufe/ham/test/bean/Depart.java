package com.jxufe.ham.test.bean;

import java.util.HashSet;
import java.util.Set;

import com.jxufe.ham.bean.abstractBean.SerializeToJsonBean;

/**
 * @Description:部门类 
 * @ClassName: Depart
 * @author hmz
 * @date 2017年3月23日 上午10:17:01
 */
public class Depart extends SerializeToJsonBean{

	private int departId;//部门编号
	
	private String departName;//部门名称
	
	private String departInfo;//部门信息
	
	private Integer departRank;//部门等级
	
	private int employeeId;//部门经理编号
	
	private Set employeesForDepartId = new HashSet(0);//部门员工

	public Depart() {
		super();
	}

	public Depart(int departId, String departName) {
		super();
		this.departId = departId;
		this.departName = departName;
	}

	public Depart(int departId, String departName, String departInfo, Integer departRank, Set employeesForDepartId,
			Set employeesForDepDepartId) {
		super();
		this.departId = departId;
		this.departName = departName;
		this.departInfo = departInfo;
		this.departRank = departRank;
		this.employeesForDepartId = employeesForDepartId;
	}

	public int getDepartId() {
		return this.departId;
	}

	public void setDepartId(int departId) {
		this.departId = departId;
	}

	public String getDepartName() {
		return this.departName;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}

	public String getDepartInfo() {
		return this.departInfo;
	}

	public void setDepartInfo(String departInfo) {
		this.departInfo = departInfo;
	}

	public Integer getDepartRank() {
		return this.departRank;
	}

	public void setDepartRank(Integer departRank) {
		this.departRank = departRank;
	}

	public Set getEmployeesForDepartId() {
		return this.employeesForDepartId;
	}

	public void setEmployeesForDepartId(Set employeesForDepartId) {
		this.employeesForDepartId = employeesForDepartId;
	}

}
