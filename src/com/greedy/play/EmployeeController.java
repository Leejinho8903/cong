package com.greedy.play;

import java.util.List;
import java.util.Map;

import com.greedy.common.EmployeeDTO;

public class EmployeeController {

	private final Employeeservice employeeservice;
	private final PrintResult printResult;

	public EmployeeController() {
		employeeservice = new Employeeservice();
		printResult = new PrintResult();
	}

	public void selectAll() {
		List<EmployeeDTO> employeeList = employeeservice.selectAll();
		if (employeeList != null) {
			printResult.printemployeeList(employeeList);
		} else {
			printResult.printErrorMessage("selectList");
		}

	}

	public void selectByNo(Map<String, String> parameter) {
		
		int no = Integer.parseInt(parameter.get("no"));
		
		EmployeeDTO employee = employeeservice.selectOne(no);
		
		if(employee != null) {
			printResult.printemployee(employee);
		} else {
			printResult.printErrorMessage("selectOne");
		}
	
	}

	public void registEmployee(Map<String, String> parameter) {
		
		EmployeeDTO employee = new EmployeeDTO();
		employee.setEmpId(parameter.get("id"));
		employee.setEmpPwd(parameter.get("pwd"));
		employee.setEmpRrn(parameter.get("rrn"));
		employee.setEmpName(parameter.get("name"));
		employee.setPhone(parameter.get("phone"));
		employee.setEmail(parameter.get("email"));
		
		if(employeeservice.registemployee(employee)) {
			printResult.printsuccessMessage("insert");
		} else {
			printResult.printErrorMessage("insert");
		}
	}

	public void modifyEmployee(Map<String, String> parameter) {
		
		EmployeeDTO employee = new EmployeeDTO();
		employee.setEmpNo(Integer.parseInt(parameter.get("no")));
		employee.setEmpId(parameter.get("id"));
		employee.setEmpPwd(parameter.get("pwd"));
		employee.setEmpRrn(parameter.get("rrn"));
		employee.setEmpName(parameter.get("name"));
		employee.setPhone(parameter.get("phone"));
		employee.setEmail(parameter.get("email"));
		
		if(employeeservice.modifyemployee(employee)) {
			printResult.printsuccessMessage("update");
		} else {
			printResult.printErrorMessage("update");
		}
		
	}

	public void deleteEmployee(Map<String, String> parameter) {
		EmployeeDTO employee = new EmployeeDTO();
		employee.setEmpNo(Integer.parseInt(parameter.get("no")));
		
		if(employeeservice.deleteemployee(employee)) {
			printResult.printsuccessMessage("delete");
		} else {
			printResult.printErrorMessage("delete");
		}
		
	}

}
