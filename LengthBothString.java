package practise;
import java.util.Scanner;
public class LengthBothString {
	public static void main(String...args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("enter a String: ");
		String word=input.nextLine();
		
		System.out.println("enter the Second String: ");
		String word2=input.nextLine();
		
		System.out.println(word.length()+"  Length for  "+word);
		System.out.println(word2.length()+ "  Length for  "+word2);
        String s=word.concat(word2);
        System.out.println("Concatenation: "+s);
      System.out.print(word.toUpperCase()+" learn ");
      System.out.println(word2.toLowerCase());
        
        
	}
	
}
