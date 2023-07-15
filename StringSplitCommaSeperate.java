package practise;
import java.util.Scanner;
public class StringSplitCommaSeperate {
	public static String reverse(String s) {
   String[] split=s.split("\\s");
	StringBuffer sbf=new StringBuffer();
	for(int index=split.length-1;index>=0;index--) 
	{
		for(int character=split[index].length()-1;character>=0;character--)
		sbf.append(split[index].charAt(character));
		if(index>0)
			sbf.append(" ");
	}
	return sbf.toString();
	}
	public static void main(String...args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String word=input.nextLine();
		
		String output=reverse(word);
		System.out.println(output);
		
		
		
		
	}

}
