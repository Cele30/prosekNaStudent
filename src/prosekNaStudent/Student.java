package prosekNaStudent;

import java.util.Arrays;

public class Student extends Covek {
	
	Ocenka[] studentOcenki = new Ocenka[3];
	
	
	public Student(int godini, String ime, String prezime) {
		super(godini, ime , prezime);
	}
	
	public void SetOcenka(int n, Ocenka o) {
		studentOcenki[n] = o;
	}
	
	public Ocenka[] getStudentOcenki() {
		return studentOcenki;
	}
	public void setStudentOcenki(Ocenka[] studentOcenki) {
		this.studentOcenki = studentOcenki;
	}

	public int GetProsek() {
		int zbir = 0;
		for(int i=0; i<3; i++) {
			zbir = zbir + studentOcenki[i].getOcenka();
		}
		return zbir / 3;
	}
	
	public String toString() {
		return "Student [studentOcenki=" + Arrays.toString(studentOcenki) + "]";
	}

	
}
