package com.sh.s1;

import java.util.Scanner;

public class StudentService {

	//학생 추가 메서드
	//메서드명 addStudent
	//학생인원수 입력
	//학생수만큼
	//이름입력
	//번호입력
	Scanner sc = new Scanner(System.in);
	public Student[] addStudent() {
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


	//메서드명은 addPoint
	//내용 : 각 학생의 점수 입력

	public Student[] addPoint(Student[] s) {
/*		System.out.println("학생의 번호를 입력하세요");
		int num=sc.nextInt();
		boolean check = true;
		for(int i=0; i<s.length; i++) {
			if(num==s[i].number) {
				System.out.println("국어 점수를 입력해 주세요");
				s[i].kor=sc.nextInt();
				System.out.println("영어 점수를 입력해 주세요");
				s[i].eng=sc.nextInt();
				System.out.println("수학 점수를 입력해 주세요");
				s[i].math=sc.nextInt();
				s[i].total=s[i].kor+s[i].eng+s[i].math;
				s[i].avg=s[i].total/3.0;
				check=false;
			}
		}
		if(check) {
			System.out.println("잘못된 번호입니다.");
		}*/
		for(int i=0; i<s.length; i++) {
			System.out.println(s[i].name+" 의 국어 점수");
			s[i].kor=sc.nextInt();
			System.out.println(s[i].name+" 의 영어 점수");
			s[i].eng=sc.nextInt();
			System.out.println(s[i].name+" 의 수학 점수");
			s[i].math=sc.nextInt();
			s[i].total=s[i].kor+s[i].eng+s[i].math;
			s[i].avg=s[i].total/3.0;
		}
		return s;

	}

}
