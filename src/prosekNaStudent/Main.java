package prosekNaStudent;

public class Main {

	
	public static void main(String[] args) {
		Student s = new Student(19, "Kristijan", "Celkoski");
		
		System.out.println(s.toStringCovek());
		
		s.SetOcenka(0,new Ocenka(10));
		s.SetOcenka(1,new Ocenka(9));
		s.SetOcenka(2,new Ocenka(9));
		
		s.getStudentOcenki()[0].setPredmet("Matematika");
		s.getStudentOcenki()[0].setDatum("20.06.2020");
		System.out.println(s.getStudentOcenki()[0].toString());
		s.getStudentOcenki()[1].setPredmet("Programiranje");
		s.getStudentOcenki()[1].setDatum("21.06.2020");
		System.out.println(s.getStudentOcenki()[1].toString());
		s.getStudentOcenki()[2].setPredmet("VebTehnologi");
		s.getStudentOcenki()[2].setDatum("22.06.2020");
		System.out.println(s.getStudentOcenki()[2].toString());
		
		
		System.out.print("Prosek: " + s.GetProsek());	
	}

}
