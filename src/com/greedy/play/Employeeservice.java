package com.greedy.play;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import static com.greedy.common.Template.getSqlSession;

import com.greedy.common.EmployeeDAO;
import com.greedy.common.EmployeeDTO;

public class Employeeservice {
	
	private final EmployeeDAO employeeDAO;
	
	public Employeeservice() {
		employeeDAO = new EmployeeDAO();
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

}
