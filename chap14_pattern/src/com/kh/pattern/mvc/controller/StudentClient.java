
package com.kh.pattern.mvc.controller;

public class StudentClient {
	
	public static void main(String[] args) {
		
		
		// 모델 객체 생성 Model
		Student model = new StudentModel("학생",17);
		
		
		
		//뷰 객체 생성 view
		StudentController controller = new StudentController(model,view);
		
		
		// 컨트롤러 객체 생성 Controller-
		controller.updateView();
		//학생 정보를 업데이트해서 출력
		controller.setStudentname("이 업데이트");
		//학생 정보 업데이트를 하자
		controller.setStudentAge(18);
		//업데이트 된 학생 정보를 출력
		controller.updateView();
		
		
		
		
		
	}

}
