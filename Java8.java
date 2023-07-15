package practise;

interface Parser{
	String parse(String str);
	
	
}
class StringParser
{
	public  String convert(String s) {
		if(s.length()>=6)
		{
			s=s.toUpperCase();
		}
			else
			{
				s=s.toLowerCase();
			}
		return s;
	}
}

class MyPrinter{
	public void print(String s,Parser p)
	{
		s=p.parse(s); 
		System.out.println(s);
	}
	
	
}
public class Java8 {
	public static void main(String...args) {
	MyPrinter m=new MyPrinter();
	StringParser sp=new StringParser();
	String str="kaviyajava developer";
	m.print(str,(sp::convert));
	
	}
}
 