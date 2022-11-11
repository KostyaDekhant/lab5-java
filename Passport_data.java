
import java.util.Scanner;

public class Passport_data
{
    private String number;
    private String series;
    public Passport_data()
    {
        this.number = "0111";
        this.series = "548834";
    }
    public Passport_data(String num)
    {
        this.number = num;
	    this.series = "132454";
    }
    public Passport_data(String num, String ser)
    {
        this.number = num;
	    this.series = ser;
    }
    public String getNum()
    {
        return this.number;
    }
    public String getSer()
    {
        return this.series;
    }
    public void setNum(String num)
    {
        number = num;
    }
    public void setSer(String ser)
    {
        series = ser;
    }
    public Passport_data read_pd()
    {
        Scanner in = new Scanner(System.in);
        String num, ser;
        System.out.print("Ведите номер паспорта: ");
		num = in.next();
        System.out.print("Введите серию: ");
		ser = in.next();
        Passport_data pd = new Passport_data(num, ser);
        return pd;
    }
}