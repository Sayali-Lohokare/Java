class MedicalEntExam{
	String ExamName = "NEET";
	int passingcriteria = 300;
	int ExamYear = 2023;

	void Students(){
		String str1 = "freashers";
		String str2 = "repeaters";

		System.out.println(ExamName);
		System.out.println(passingcriteria);
		System.out.println(ExamYear);
	}
}
class CompetitiveExams{
	public static void main(String[] args){
		MedicalEntExam obj = new MedicalEntExam();
		obj.Students();
	}
}
