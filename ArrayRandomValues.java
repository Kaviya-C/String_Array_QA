package practise;

import java.util.Random;
public class ArrayRandomValues {
	public static void main(String...args) {
		Random r=new Random();
		
		int[] a=new int[12];
		
		for(int index=0;index<a.length;index++) {
			a[index]=r.nextInt(20);
		}
		try {
		System.out.println(a[12]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		for(int i: a) {
			System.out.print(i+" ");
		}
	}

}
