package com.sh.s1;

public class StudentView {

	//학생들의 정보를 출력
	//메서드명 view
	//학생들의 정보를 출력
	public void view(Student[] s) {

		for(int i=0; i<s.length; i++) {
			System.out.println("학생의 이름은 : "+s[i].name);
			System.out.println("학생의 번호는 : "+s[i].number);
			System.out.println("학생의 국어점수 : "+s[i].kor);
			System.out.println("학생의 영어점수 : "+s[i].eng);
			System.out.println("학생의 수학점수 : "+s[i].math);
			System.out.println("학생의 전체점수 : "+s[i].total);
			System.out.println("학생의 평균점수 : "+s[i].avg);
		}
	}


}
