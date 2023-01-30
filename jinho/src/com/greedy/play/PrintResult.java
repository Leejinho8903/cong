package com.greedy.play;

import java.util.List;

import com.greedy.common.EmployeeDTO;


public class PrintResult {

	public void printemployeeList(List<EmployeeDTO> employeeList) {
		for(EmployeeDTO employee : employeeList) {
			System.out.println(employee);
		}	
	}
	public void printemployee(EmployeeDTO employee) {
		System.out.println(employee);	
	}
	
	
	public void printErrorMessage(String errorCode) {
		String errorMessage = "";
		switch(errorCode) {
		case "selectList" : errorMessage = "회원 목록 조회에 실패하셨습니다."; break;
		case "selectOne" : errorMessage = "회원 조회에 실패하셨습니다."; break;
		case "insert" : errorMessage = "회원 정보 추가에 실패하셨습니다."; break;
		case "update" : errorMessage = "회원 정보 수정에 실패하셨습니다."; break;
		case "delete" : errorMessage = "회원 정보 삭제에 실패하셨습니다."; break;
		}
		System.out.println(errorMessage);
	}
	
	public void printsuccessMessage(String successCode) {
		String successMessage = "";
		switch(successCode) {
		case "insert" : successMessage = "회원 등록에 성공하였습니다."; break;
		case "update" : successMessage = "회원 수정에 성공하였습니다."; break;
		case "delete" : successMessage = "회원 삭제에 성공하였습니다."; break;
		
		}
		System.out.println(successMessage);
		
	}
	public void printemployee(String id) {
		System.out.println(id);
		
	}
}
