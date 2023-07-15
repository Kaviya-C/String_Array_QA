package practise;
import java.util.Scanner;
public class ReverseString {
	public static void main(String...args) {
		
		String sentences="kaviya placed in StartUp";
		
		String result=reverseWord(sentences);
		
		//System.out.println("original String; "+sentences);
		System.out.println(result);
		
	}
	public static String reverseWord(String sent) {
		
		
		StringBuffer sbf=new StringBuffer();
	
		String[] array=sent.split("\\s");
		
		String result=" ";
		
		for(int index=0;index<array.length;index++) {
			for(int sec=array[index].length()-1;sec>=0;sec--) { 
			sbf.append(array[index].charAt(sec));
			}
			if(index>=0)
				sbf.append(" ");
			
		}
		String s=sbf.toString();
		return s;
	}

}
