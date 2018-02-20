package com.sh.s1;

import java.util.Scanner;

public class SchoolController {


	//메서드명은 start
	//리턴은 없다
	//내용은 
	//1. 학생등록
	//2. 성적입력
	//3. 성적조회
	//4. 전체조회
	//5. 프로그램종료
	public void start() {
		boolean check=true;
		Scanner sc = new Scanner(System.in);
		StudentService ss = new StudentService();
		StudentView sv = new StudentView();
		Student[] s=null;
		Student t=null;
		while(check) {
			System.out.println("1. 학생등록, 2.성적 입력, 3.성적 조회, 4.전체 조회, 5.프로그램종료");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				s=ss.addStudent();
				break;
			case 2:
				ss.addPoint(s);
				break;
			case 3:
				t=ss.search(s);
				if(t!=null) {
					sv.viewStudent(t);
				}else {
					System.out.println("잘못 된 번호");
				}
				break;
			case 4:
				System.out.println("전체 조회");
				sv.view(s);
				break;
			case 5:
				System.out.println("프로그램 종료");
				check=false;
				break;
			default :
				System.out.println("잘못된 번호입니다 다시 입력해주세요");
				break;
			}
		}
	}

}
