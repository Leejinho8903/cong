package com.greedy.common;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class EmployeeDAO {

	public List<EmployeeDTO> selectAll(SqlSession sqlSession) {
		return sqlSession.selectList("EmployeeMapper.selectAllEmp");
	}

	public EmployeeDTO selectOne(SqlSession sqlSession, int no) {
		return sqlSession.selectOne("EmployeeMapper.selectOne", no);
	}

	public int insertemployee(SqlSession sqlSession, EmployeeDTO employee) {
		return sqlSession.insert("EmployeeMapper.insert", employee);
	}

	public int updateemployee(SqlSession sqlSession, EmployeeDTO employee) {
		return sqlSession.update("EmployeeMapper.update", employee);
	}

	public int deleteemployee(SqlSession sqlSession, EmployeeDTO employee) {
		return sqlSession.delete("EmployeeMapper.delete", employee);
	}

}
