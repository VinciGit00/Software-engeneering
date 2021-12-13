package playerrole;

abstract class LevelRole{
	Student student;//studente che ha assunto il ruolo
	
	LevelRole(Student s){
		student = s;
		s.role = this;
	}
}

//ruolo da studente diplomato
class GraduateStudent extends LevelRole{
	
	GraduateStudent(Student s) {
		super(s);
		System.out.println("Lo studente " + student.firstName + " " + student.lastName + " assume il ruolo di graduate.");
	}

	void startWorking(){
		System.out.println("Lo studente " + student.firstName + " " + student.lastName + " comincia a lavorare.");
	}
}

//ruolo da studente non diplomato
class UnderGraduateStudent extends LevelRole{
	
	UnderGraduateStudent(Student s) {
		super(s);
		System.out.println("Lo studente " + student.firstName + " " + student.lastName + " assume il ruolo di under graduate.");
	}

	void graduate(){
		System.out.println("Lo studente " + student.firstName + " " + student.lastName + " si diploma.");
	}
}

//classe che puo' assumere diversi ruoli
class Student{
	String firstName;
	String lastName;
	LevelRole role;//indica il ruolo dello studente
	
	Student(String first, String last){
		firstName = first;
		lastName = last;
	}
}

//esempio di utilizzo
public class PlayerRoleExample {

	public static void main(String[] args) {
		Student st = new Student("Mario", "Rossi");//creazione dello studente
		UnderGraduateStudent stUnder = new UnderGraduateStudent(st);//all'inizio lo studente e' undergraduate (gli si associa il ruolo)
		stUnder.graduate();//lo studente si diploma
		GraduateStudent stGrad = new GraduateStudent(st);//lo studente cambia ruolo e diventa graduate
		stGrad.startWorking();//comincia a lavorare		
	}
}