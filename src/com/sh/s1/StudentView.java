package com.sh.s1;

public class StudentView {

	//학생들의 정보를 출력
	//메서드명 view
	//학생들의 정보를 출력
	public void view(String message) {
		System.out.println(message);
	}
	
	public void view(Student t) {
		System.out.println("학생의 이름은 : "+t.name);
		System.out.println("학생의 번호는 : "+t.number);
		System.out.println("학생의 국어점수 : "+t.kor);
		System.out.println("학생의 영어점수 : "+t.eng);
		System.out.println("학생의 수학점수 : "+t.math);
		System.out.println("학생의 전체점수 : "+t.total);
		System.out.println("학생의 평균점수 : "+t.avg);
		
	}
	public void view(Student[] s) {
		
		for(int i=0; i<s.length; i++) {
			this.view(s[i]);
		}
	}


}
