
public class College {
	public void collegeName() {
		System.out.println("sindhu mahavidyalaya");
	}

	public void collegeCode() {
		System.out.println("567");
	}

	public void collegeRank() {
		System.out.println("4");
	}

	public static void main(String[] args) {
		
		College c= new College();
		c.collegeName();
		c.collegeCode();
		c.collegeRank();

		Student s = new Student();
		s.studentName();
		s.studentDept();
		s.studentId();

		Hostel h = new Hostel();
		h.hostelName();

		Dept d = new Dept();
		d.deptName();

	}

}
