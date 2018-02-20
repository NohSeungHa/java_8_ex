package com.sh.s1;

import java.util.Scanner;

public class StudentService {
	
	//학생 추가 메서드
	//메서드명 addStudent
	//학생인원수 입력
	//학생수만큼
	//이름입력
	//번호입력
	public Student[] addStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수를 입력하세요.");
		int n = sc.nextInt();
		Student[] stu = new Student[n];//
		
		
/*		for(int i=0; i<stu.length; i++) {
			stu[i]=new Student();
			System.out.println("학생의 이름을 입력하세요");
			stu[i].name=sc.next();
			System.out.println("학생의 번호를 입력하세요");
			stu[i].number=sc.nextInt();*/
		for(int i=0; i<stu.length; i++) {
			Student student = new Student();
			System.out.println("학생의 이름을 입력하세요");
			student.name=sc.next();
			System.out.println("학생의 번호를 입력하세요");
			student.number=sc.nextInt();
			stu[i]=student;
		}
		return stu;
	}


}
