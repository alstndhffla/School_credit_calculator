package grade;

//점수에 따른 학점을 평가하는 방법. 여러 산출 방법 클래스가 구현할 내용을 인터페이스로 정의
public interface GradeEvaluation {
	public String getGrade(int point);
}
