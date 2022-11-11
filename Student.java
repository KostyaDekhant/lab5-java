import java.util.Scanner;
import java.io.*;

public class Student{
    private int sholarship = 0;
    private String group = "";
    private Human human;
    private static int count_stud;

    public static int getCountStud() {
        return count_stud;
    }
    public static void setCountStud(int newCountStud) {
        count_stud = newCountStud;
    }
    public Student()
    {
        human = new Human();
        sholarship = 2000;
        group = "ПИ11";
    }
    public Student(Human human)
    {
        this.human = new Human(human.getFIO() ,human.getPD() , human.getAge()); 
        sholarship = 2400;
        group = "ПИ11";
    }
    public Student(Human human, int sholar, String gr)
    {
        this.human = new Human(human.getFIO() ,human.getPD() , human.getAge()); 
        this.sholarship = sholar;
        this.group = gr;
    }
	public void read_student()
	{
		Scanner in = new Scanner(System.in, "cp866");
        System.out.print("\nВвод студента: \n");
        this.human = human.read_human();
        System.out.print("Введите размер стипендии: ");
        sholarship = in.nextInt();
        System.out.print("Введите номер группы: ");
        group = in.next();
	}
    public void print(int i)
	{
        FIO fio = new FIO();
        fio = this.human.getFIO();
        System.out.print("\nВывод : \n");
        System.out.print(i+"-й студент: \n");
        System.out.print("ФИО: "+ fio.getLast() + " "+ fio.getFirst() + " "+ fio.getMid() + "\n");
        System.out.print("Номер и серия паспорта: " + this.human.getPD().getNum() + " " + this.human.getPD().getSer()+ "\n");
        System.out.print("Возраст: " + this.human.getAge()+ "\n");
        System.out.print("Студент группы: " + this.group+ "\n");
        System.out.print("Стипендия: " + this.sholarship+ "\n");
        System.out.print("\n\n");
    }
    public void ChangeInfo()
    {
        Scanner in = new Scanner(System.in, "cp866");
        System.out.print("Выберите, что хотите поменять: \n1. ФИО\n2.Паспортные данные\n3.Возраст\n" + 
        "4.Номер группы\n5.Размер стипендии\n");
        int inp = in.nextInt();
        if(inp == 1)
        {
            String first, mid, last;
            System.out.print("Введите фамилию: ");
		    last = in.next();
            System.out.print("Введите имя: ");
		    first = in.next();
            System.out.print("Введите отчество: ");
		    mid = in.next();
            human.setFIO(first, mid, last);
        }
        else if(inp == 2)
        {
            String num, ser;
            System.out.print("Введите номер паспорта: ");
            num = in.next();
            System.out.print("Введите серию: ");
            ser = in.next();
            human.setPD(num, ser);
        }
        else if(inp == 3)
        {
            System.out.print("Введите возраст: ");
            int age = in.nextInt();
            this.human.setAge(age);
        }
        else if(inp == 4)
        {
            System.out.print("Введите номер группы: ");
            this.group = in.next();
        }
        else if(inp == 5)
        {
            System.out.print("Введите размер стипендии: ");
            this.sholarship = in.nextInt();
        }
    }
    public void getSholarship(Sholar sh)
    {
        sh.sholar = this.sholarship;
    }
	public void FileWriteStudentName(){
        try (FileOutputStream fos = new FileOutputStream("C://Users/Podor/Documents/GitHub/lab5-java/Students.txt", true)){
            byte[] buffer = (this.human.getFIO().getLast() + "\n" + 
			this.human.getFIO().getFirst() + "\n" + this.human.getFIO().getMid() + "\n").getBytes();
            fos.write(buffer, 0, buffer.length);
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    public void FileReadStudentName(){
        try (FileInputStream fin = new FileInputStream("C://Users/Podor/Documents/GitHub/lab5-java/Students.txt")){
            int i = -1;
			PrintStream out = new PrintStream(System.out, true, "cp866");
            while ((i=fin.read())!=-1){
				out.print((char)i);
            //   System.out.print((char)i);
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}

