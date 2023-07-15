package practise;

public class PatternMatching {
   public static void main(String[] args)
 {
   String word="ArunBalaji";
   String pattern="unB";
   
   boolean result=findPattern(word,pattern);
   
   if(result) 
	   System.out.println("pattern Found");
   else
	   System.out.println("pattern not found");
 }
   public static boolean findPattern(String words,String pattern) 
   {
	   int wordLen=words.length();
	   int patLen=pattern.length();
	   for(int index=0;index<wordLen-patLen;index++) 
	   {
		   if(words.substring(index,index+patLen).equals(pattern)) 
			   return true;  
	   }
	   return false;
   }
}
