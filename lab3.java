import java.util.Scanner;


public class lab3{
	public static void main(String args[])
	{
		Student[] stud = new Student[2];
		Student.setCountStud(2);
		FIO fio = new FIO("Сергей");
		Human human = new Human(fio);
		Professor prof = new Professor(human);
		for(int i = 0; i < Student.getCountStud(); i++) {
            stud[i] = new Student();
			stud[i].print(i+1);
        }
		prof.print(Professor.getCountProf());
		Professor prof1 = new Professor();
		
		stud[1].read_student();
		stud[1].print(Student.getCountStud());
		for(int i = 0; i < Student.getCountStud(); i++)
			stud[i].FileWriteStudentName();
		System.out.println("Фамилии студентов:");
		for(int i = 0; i < Student.getCountStud(); i++)
			stud[0].FileReadStudentName();
		//prof1.read_professor();
		//prof1.print(Professor.getCountProf());

		//stud[1].ChangeInfo();
		//stud[1].print(Student.getCountStud()-1);

		//Sholar sh = new Sholar();
		//stud[1].getSholarship(sh);
		//System.out.println("Стипендия 2-го студента: " + sh.sholar + "\n\n");

		//prof.ChangeInfo();
		//prof.print(Professor.getCountProf()-1);
	}
}