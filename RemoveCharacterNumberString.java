package practise;

public class RemoveCharacterNumberString {
	public static void main(String...args) {
		String wordNumber="94kav452iya9o91jh50p";
		
		String result= removeCharacter(wordNumber);
		
		System.out.println(result);
	}
	public static String removeCharacter(String word) {
		
		StringBuffer sb=new StringBuffer(word);
		
		for(int index=0;index<sb.length();index++) {
			
			if(sb.charAt(index)<48 || sb.charAt(index)>57)
			{
				sb.deleteCharAt(index);
				index--;
			}
		}
		return sb.toString();
	}
	

}
