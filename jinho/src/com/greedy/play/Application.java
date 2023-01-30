package com.greedy.play;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.greedy.common.EmployeeDTO;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeController employeeController = new EmployeeController();

		do {
			System.out.println("======= 회원 관리 =======");
			System.out.println("1. 회원 전체 조회");
			System.out.println("2. 회원번호로 조회");
			System.out.println("3. 신규 회원 추가");
			System.out.println("4. 회원 수정");
			System.out.println("5. 회원 삭제");
			System.out.println("6. 회원 아이디 찾기");
			System.out.print("회원 관리 번호 입력 : ");
			int no = sc.nextInt();
			
			switch(no) {
			case 1 : employeeController.selectAll(); break;
			case 2 : employeeController.selectByNo(inputEmpNo()); break;
			case 3 : employeeController.registEmployee(inputEmp()); break;
			case 4 : employeeController.modifyEmployee(imputmodify()); break;
			case 5 : employeeController.deleteEmployee(inputEmpNo()); break;
			case 6 : selectId(); break;
			default : System.out.println("잘못 된 번호를 입력하셨습니다.");
			}
		
		} while(true);
	
	}


	private static Map<String, String> inputEmpNo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("회원 번호 입력 : ");
		String no = sc.nextLine();
		
		Map<String, String> parameter = new HashMap<>();
		parameter.put("no", no);
		return parameter;
	}
	
	private static Map<String, String> inputEmp() {
		Scanner sc = new Scanner(System.in);
		Map<String, String> parameter = new HashMap<>();
		System.out.print("회원 아이디를 입력하세요 : ");
		parameter.put("id", sc.nextLine());
		System.out.print("회원 비밀번호를 입력하세요 : ");
		parameter.put("pwd", sc.nextLine());
		System.out.print("주민등록번호를 입력하세요 : ");
		parameter.put("rrn", sc.nextLine());
		System.out.print("이름을 입력하세요 : ");
		parameter.put("name", sc.nextLine());
		System.out.print("전화번호를 입력하세요 : ");
		parameter.put("phone", sc.nextLine());
		System.out.print("이메일을 입력하세요 : ");
		parameter.put("email", sc.nextLine());
		return parameter;
	}
	
	private static Map<String, String> imputmodify() {
		
		Scanner sc = new Scanner(System.in);
		Map<String, String> parameter = new HashMap<>();
		System.out.print("수정할 회원 번호를 입력하세요 : ");
		parameter.put("no", sc.nextLine());
		System.out.print("회원 아이디를 수정하세요 : ");
		parameter.put("id", sc.nextLine());
		System.out.print("회원 비밀번호를 수정하세요 : ");
		parameter.put("pwd", sc.nextLine());
		System.out.print("이름을 수정하세요 : ");
		parameter.put("name", sc.nextLine());
		System.out.print("전화번호를 수정하세요 : ");
		parameter.put("phone", sc.nextLine());
		System.out.print("이메일을 수정하세요 : ");
		parameter.put("email", sc.nextLine());
		return parameter;
	}
	private static void selectId() {
		Scanner sc = new Scanner(System.in);
		Employeeservice employeeservice = new Employeeservice();
		EmployeeController employeeController = new EmployeeController();
		do {
			System.out.println("1. 회원 아이디 조회");
			System.out.println("2. 회원 정보 수정");
			System.out.println("9. 이전 메뉴로");
			System.out.print("메뉴 번호 입력 : ");
			int no = sc.nextInt();
			
			switch(no){
			case 1 : employeeservice.selectId(inputRrn()); break;
			case 2 : employeeController.modifyemp(inputRRN()); break;
			case 9 : 
			}
					
		} while(true); 			
		
	}

	private static Map<String, String> inputRRN() {
		Scanner sc = new Scanner(System.in);
		Map<String, String> parameter = new HashMap<>();
		System.out.print("수정할 회원의 주민등록 번호를 입력하세요 : ");
		parameter.put("empRrn", sc.nextLine());
		System.out.print("회원 아이디를 수정해주세요 : ");
		parameter.put("empId", sc.nextLine());
		System.out.print("회원 비밀번호를 수정해주세요 : ");
		parameter.put("empPwd", sc.nextLine());
		return parameter;
	}


	private static Map<String, String> inputRrn() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민 등록 번호 입력 : ");
		String empRrn = sc.nextLine();
		
		Map<String, String> parameter = new HashMap<>();
		parameter.put("empRrn", empRrn);
		return parameter;
	}


}
