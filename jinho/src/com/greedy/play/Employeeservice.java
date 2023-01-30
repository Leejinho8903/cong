package com.greedy.play;

import static com.greedy.common.Template.getSqlSession;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import com.greedy.common.EmployeeDAO;
import com.greedy.common.EmployeeDTO;

public class Employeeservice {
	
	private final EmployeeDAO employeeDAO;
	private final PrintResult printResult;
	public Employeeservice() {
		employeeDAO = new EmployeeDAO();
		printResult = new PrintResult();
	}

	public List<EmployeeDTO> selectAll() {
		SqlSession sqlSession = getSqlSession();
		
		List<EmployeeDTO> employeeList = employeeDAO.selectAll(sqlSession);
		
		sqlSession.close();
		return employeeList;
	}

	public EmployeeDTO selectOne(int no) {
		SqlSession sqlSession = getSqlSession();
		
		EmployeeDTO employee = employeeDAO.selectOne(sqlSession, no);
		sqlSession.close();
		return employee;
	}

	public boolean registemployee(EmployeeDTO employee) {
		SqlSession sqlSession = getSqlSession();
		int result = employeeDAO.insertemployee(sqlSession, employee);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		
		sqlSession.close();
		
		return result > 0 ?  true : false;
	}

	public boolean modifyemployee(EmployeeDTO employee) {
		SqlSession sqlSession = getSqlSession();
		int result = employeeDAO.updateemployee(sqlSession, employee);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		sqlSession.close();
		return result > 0 ? true : false;
	}
	
	
	public boolean deleteemployee(EmployeeDTO employee) {
		SqlSession sqlSession = getSqlSession();
		int result = employeeDAO.deleteemployee(sqlSession, employee);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		sqlSession.close();
		return result > 0 ? true : false;
	}

	public EmployeeDTO selectId(Map<String, String> parameter) {
		SqlSession sqlSession = getSqlSession();
		String rrn = parameter.get("empRrn");
		
		EmployeeDTO employee = employeeDAO.selectId(sqlSession, rrn);
		
		if(employee != null) 
		{
			printResult.printemployee(employee.getEmpId());
		} else {
			printResult.printErrorMessage("selectOne");
		}
		sqlSession.close();
		return employee;
	
	}

	public boolean modifyemp(EmployeeDTO employee) {
		SqlSession sqlSession = getSqlSession();
		int result = employeeDAO.updateemp(sqlSession, employee);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		sqlSession.close();
		return result > 0 ? true : false;
	}



	

}
