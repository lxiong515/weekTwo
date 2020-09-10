package model;

//Luke Xiong

public class Employee {
	
	private String name;
	private double monthlySalary;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	//public void setMonthlySalary(double monthlySalary) {
		//this.monthlySalary = monthlySalary;
	//}
	
	public void setMonthlySalary(double monthlySalary) {
		// TODO Auto-generated method stub
		this.monthlySalary = monthlySalary;
		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Employee (String name) {
		this.name = name;
	}
	
	public double calculateYearlySalary(Employee employee) {
		double yearlySalary = 0;
		yearlySalary = employee.getMonthlySalary() * 12;
		return yearlySalary;
	}
	public double calculateAppraisal(Employee employee) {
		double appraisal = 0;
		
		if (employee.getMonthlySalary()<1000) {
			appraisal = 500;
		} else {
			appraisal = 1000;
		}
		return appraisal;
	}
	 public boolean isRetirementAge(Employee employee) {
	 
		int age = 0;
		boolean retirementAge = true;
		
		if (employee.getAge()<65) {
			retirementAge= false;
		} else {
			retirementAge = true;
		}
		return retirementAge;
	}
	

	

}
