package File;

import java.io.Serializable;

public class Employee implements Serializable{
	private int EmpId;
	private String empName;
	private float empSalary;
	private transient double bankBalance;
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getBankBalance() {
		return bankBalance;
	}
	public void setBankBalance(double bankBalance) {
		this.bankBalance = bankBalance;
	}
	public float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", empName=" + empName + ", empSalary=" + empSalary + ", bankBalance="
				+ bankBalance + "]";
	}
	
}
