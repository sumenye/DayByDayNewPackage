package April24;

public class GraderApp {

	public static void main(String[] args) {

//grade your score b range and give grade of A,B,C,D,E,F,
		System.out.println(gradeTheScore(99));
		System.out.println(gradeTheScore(89));
		System.out.println(gradeTheScore(79));
		System.out.println(gradeTheScore(69));
		System.out.println(gradeTheScore(10));
		System.out.println(gradeTheScore(101));
}

	public static char gradeTheScore(int score) {
		if (score <= 100 && score >= 90)
			return 'A';
		if (score < 90 && score >= 80)
			return 'B';
		if (score < 80 && score >= 70)
			return 'C';
		return 'F';
//		if (score <= 100 && score >= 90) {
//			return 'A';
//			//System.out.println("YOU GOT A ");
//		}else if (score < 90 && score >= 80) {
//			return 'B';
//			//System.out.println(" YOU GOT B ");
//		}else if (score < 80 && score >= 70) {
//			return 'C';
//			//System.out.println(" YOU GOT C ");
//		}else {
//			return 'F';
//			//System.out.println(" Study harder! ");
//		}	
	}
}
