package grade;

//패스페일제 평가방식 클래스
public class PassFailEvaluation implements GradeEvaluation{

	@Override
	public String getGrade(int point) {
		if (point >= 70) 
			return "P";
		else
		    return "F";
	}
}
