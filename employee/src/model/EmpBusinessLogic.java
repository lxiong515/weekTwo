package model;

//Luke Xiong

public class EmpBusinessLogic {

	//calculates yearly salary of an employee and
	//appraisal amount of an employee
		
		public double calculateYearlySalary(Employee employee) {
			double yearlySalary = 0;
			yearlySalary = employee.getMonthlySalary() * 12;
			return yearlySalary;
			//return 0.0;
		}
		public double calculateAppraisal(Employee employee) {
			double appraisal = 0;
			
			if (employee.getMonthlySalary()<1000) {
				appraisal = 500;
			} else {
				appraisal = 1000;
			}
			return appraisal;
			//return 0.0;
		}
		public boolean isRetirementAge(Employee employee) {
			// TODO Auto-generated method stub
			if (employee.getAge()<65) {
				return false;
			} else {
			return true;
			}
		}
	
}
