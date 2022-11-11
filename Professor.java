import java.util.Scanner;

public class Professor{
    private int wage = 0;
    private int experience = 0;
    private String subject = "";
    private Human human;
    private static int count_prof;
    public static int getCountProf() {
        return count_prof;
    }
    public static void setCountProf(int newCountProf) {
        count_prof = newCountProf;
    }

    public Professor()
    {
        human = new Human();
        wage = 20000;
        experience = 15;
        subject = "Математика";
        count_prof++;
    }
    public Professor(Human human)
    {
        this.human = new Human(human.getFIO() ,human.getPD() , human.getAge()); 
        wage = 25000;
        experience = 20;
        subject = "Физика";
        count_prof++;
    }
    public Professor(Human human, int wg, String sub, int exp)
    {
        this.human = new Human(human.getFIO() ,human.getPD() , human.getAge()); 
        this.wage = wg;
        this.experience = exp;
        this.subject = sub;
        count_prof++;
    }
	public void read_professor()
	{
		Scanner in = new Scanner(System.in);
        System.out.print("\nВвод преподавателя: \n");
        this.human = human.read_human();
        System.out.print("Введите размер зарплаты: ");
        wage = in.nextInt();
        System.out.print("Введите стаж: ");
        experience = in.nextInt();
        System.out.print("Введите предмет: ");
        subject = in.next();
	}
    public void print(int i)
	{
        FIO fio = new FIO();
        fio = this.human.getFIO();
        System.out.print("\nВывод : \n");
        System.out.print(i+"-й преподаватель: \n");
        System.out.print("ФИО: "+ fio.getLast() + " "+ fio.getFirst() + " "+ fio.getMid() + "\n");
        System.out.print("Номер и серия паспорта: " + this.human.getPD().getNum() + " " + this.human.getPD().getSer()+ "\n");
        System.out.print("Возраст: " + this.human.getAge()+ "\n");
        System.out.print("Предмет: " + this.subject+ "\n");
        System.out.print("Зарплата: " + this.wage+ "\n");
        System.out.print("Стаж: " + this.experience+ "\n");
        System.out.print("\n\n");
    }
    public void ChangeInfo()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Выберите, что хотите поменять: \n1. ФИО\n2.Паспортные данные\n3.Возраст\n" + 
        "4.Предмет\n5.Размер зарплаты\n6.Стаж\n");
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
            System.out.print("Введите предмет: ");
            this.subject = in.next();
        }
        else if(inp == 5)
        {
            System.out.print("Введите размер зарплаты: ");
            this.wage = in.nextInt();
        }
        else if(inp == 6)
        {
            System.out.print("Введите стаж: ");
            this.experience = in.nextInt();
        }
    }
}