
import java.util.Scanner;

public class Human{
    private int age;
    private FIO fio;
    private Passport_data pd;
    public Human()
    {
        fio = new FIO();
        pd = new Passport_data();
        this.age = 19;
    }
    public Human(FIO fio)
    {
        this.fio = fio;
	    Passport_data initpassport_data = new Passport_data("0128");
	    this.pd = initpassport_data;
	    this.age = 50;
    }
    public Human(FIO fio1, Passport_data pd1, int age1)
    {
        this.fio = fio1;
	    this.pd = pd1;
	    this.age = age1;
    }
    public FIO getFIO()
    {
        fio.getFirst();
        fio.getMid();
        fio.getLast();
        return fio;
    }
    public Passport_data getPD()
    {
        pd.getNum();
	    pd.getSer();
	    return pd;
    }
    public int getAge()
    {
        return age;
    }
    public void setFIO(String first, String mid, String last)
    {
        fio.setFirst(first);
	    fio.setMid(mid);
	    fio.setLast(last);
    }
    public void setPD(String num, String ser)
    {
        pd.setNum(num);
	    pd.setSer(ser);
    }
    public void setAge(int age)
    {
        this.age = age;
    }
	public Human read_human()
	{
		Scanner in = new Scanner(System.in);
        FIO fio1 = new FIO();
        Passport_data pd1 = new Passport_data();
        fio1 = fio1.read_FIO();
        pd1 = pd1.read_pd();
        System.out.print("Введите возраст: ");
		age = in.nextInt();
        Human human = new Human(fio1, pd1, age);
        return human;
	}
}