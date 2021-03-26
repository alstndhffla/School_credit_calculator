package grade;

//일반 과목 학점 정책
public  class BasicEvaluation implements GradeEvaluation{

	@Override	//오버라이드 어노테이션 - 재정의된 메서드라고 컴파일러에 알려주는 역할.
	public String getGrade(int point) {
		String grade;
		
		if(point >=90 && point <=100)
			grade = "A";
		else if(point >=80 && point <=89)
			grade = "B";
		else if(point >=70 && point <=79)
			grade = "C";
		else if(point >=55 && point <=69)
			grade = "D";
		else
			grade = "F";
		return grade;
	}
}
