
import java.util.Scanner;

public class FIO{
    private String firstname;
    private String middle;
    private String lastname;
    public FIO()
    {
        firstname = "Иван";
	    middle = "Иванович";
	    lastname = "Иванов";
    }
    public FIO(String first)
    {
        firstname = first;
	    middle = "Алексеевич";
	    lastname = "Смирнов";
    }
    public FIO(String first, String mid, String last)
    {
        firstname = first;
	    middle = mid;
	    lastname = last;
    }
    public String getFirst()
    {
        return this.firstname;
    }
    public String getMid()
    {
        return this.middle;
    }
    public String getLast()
    {
        return this.lastname;
    }
    public void setFirst(String first)
    {
        firstname = first;
    }
    public void setMid(String mid)
    {
        middle = mid;
    }
    public void setLast(String last)
    {   
        lastname = last;
    }
	public FIO read_FIO()
	{
		Scanner in = new Scanner(System.in);
        String first, mid, last;
        System.out.print("Введите фамилию: ");
		last = in.nextLine();
        System.out.print("Введите имя: ");
		first = in.nextLine();
        System.out.print("Введите отчество: ");
		mid = in.nextLine();
        FIO fio1 = new FIO(first, mid, last);
        return fio1;
	}
}