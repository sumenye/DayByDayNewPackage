package May21;



public class StudentTester {

	public static void main(String[] args) {
		Person p1 = new Person();
        p1.name="Trovolta";
        p1.age= 33;
        p1.height=6.2f;
        p1.gender='M';
        System.out.println(p1.height);

		Student s1 = new Student();

		s1.name = "Oguzhan";
		s1.age = 15;
		s1.gender = 'M';
		s1.height = 5.10f;
		s1.studentId = 123;
		 System.out.println(s1.studentId);
		
	}

}
