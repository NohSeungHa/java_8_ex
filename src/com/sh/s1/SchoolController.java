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
		while(check) {
			System.out.println("1. 학생등록, 2.성적 입력, 3.성적 조회, 4.전체 조회, 5.프로그램종료");
			int num = sc.nextInt();
			switch(num) {
			case 1:
				System.out.println("학생의 이름을 입력하세요");
				break;
			case 2:
				System.out.println("성적을 입력하세요");
				break;
			case 3:
				System.out.println("조회할 학생을 입력하세요");
				break;
			case 4:
				System.out.println("전체 조회");
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
