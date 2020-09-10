package tests;

//Luke Xiong

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.EmpBusinessLogic;
import model.Employee;

public class TestEmployeeLogic {
	EmpBusinessLogic empBL= new EmpBusinessLogic();
	Employee employee = new Employee("Ryan");

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		employee.setMonthlySalary(800);
		double appraisal = empBL.calculateAppraisal(employee);
		assertEquals(500.00, appraisal, 0.0);
		

	}
	
	@Test
	public void testcalculateYearlySalary() {
		
		employee.setMonthlySalary(8000);
		double salary = empBL.calculateYearlySalary(employee);
		assertEquals(96000.00, salary, 0.0);

	}
	@Test
	public void testEmployeeIsRetirementAge() {
		employee.setAge(70);
		assertTrue(empBL.isRetirementAge(employee));
	}
	@Test
	public void testEmployeeIsNotRetirementAge() {
		employee.setAge(25);
		assertFalse(empBL.isRetirementAge(employee));
	}

}
