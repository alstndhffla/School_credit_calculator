package test;

import school.School;
import school.Score;
import school.Student;
import school.Subject;
import school.report.GenerateGradeReport;
import utils.Define;

public class TestMain {

	School goodSchool = School.getInstance();
	Subject korean;
	Subject math;
	Subject dance;
	
	GenerateGradeReport gradeReport = new GenerateGradeReport();
	
	public static void main(String[] args) {
		
		TestMain test = new TestMain();
		
		test.creatSubject();
		test.createStudent();
		
		String report = test.gradeReport.getReport(); //성적 결과 생성
		System.out.println(report); //
		
	}
	
	//테스트 과목 생성
	public void creatSubject(){
		
		korean = new Subject("국어", Define.KOREAN);
		math = new Subject("수학", Define.MATH);
		dance = new Subject("댄스", Define.DANCE);
		
		dance.setGradeType(Define.PF_TYPE);	//댄스에 한해 패스페일제 학점 평가 정책 지정
		
		goodSchool.addSubject(korean);
		goodSchool.addSubject(math);
		goodSchool.addSubject(dance);
		
	}
	
	//테스트 학생 생성
	public void createStudent(){
		
		Student student1 = new Student(181213, "김민수", korean  );
		Student student2 = new Student(181518, "홍석호", math  );
		Student student3 = new Student(171230, "이덕주", korean  );
		Student student4 = new Student(171255, "임경헌", korean  );
		Student student5 = new Student(171590, "김요한", math );
		
		//학생 자체 추가
		goodSchool.addStudent(student1);
		goodSchool.addStudent(student2);
		goodSchool.addStudent(student3);
		goodSchool.addStudent(student4);
		goodSchool.addStudent(student5);
		
		//국어과목 듣는 학생 등록
		korean.register(student1);
		korean.register(student2);
		korean.register(student3);
		korean.register(student4);
		korean.register(student5);
		
		math.register(student1);
		math.register(student2);
		math.register(student3);
		math.register(student4);
		math.register(student5);
		
		//추가 과목 댄스
		dance.register(student1);
		dance.register(student2);
		dance.register(student3);
		
		addScoreForStudent(student1, korean, 95); 
		addScoreForStudent(student1, math, 56);	
		
		addScoreForStudent(student2, korean, 95); 
		addScoreForStudent(student2, math, 95);	
		
		addScoreForStudent(student3, korean, 100); 
		addScoreForStudent(student3, math, 88);	
		
		addScoreForStudent(student4, korean, 89); 
		addScoreForStudent(student4, math, 95);	
		
		addScoreForStudent(student5, korean, 85); 
		addScoreForStudent(student5, math, 56);	
		
		addScoreForStudent(student1, dance, 95);	
		addScoreForStudent(student2, dance, 85); 
		addScoreForStudent(student3, dance, 55);	
		
	}

	//과목별 점수를 추가 메서드
	public void addScoreForStudent(Student student, Subject subject, int point){
		
		Score score = new Score(student.getStudentId(), subject, point);
		student.addSubjectScore(score);
		
	}
}
