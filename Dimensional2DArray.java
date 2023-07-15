package practise;
import java.util.Random;
public class Dimensional2DArray {
	
	public static void main(String...args) {
		Display obj=new Display();
		obj.show(14,12,19,90);
	}

}
class Display{
	public void show(int ... a) {
		for(int index=0;index<a.length;index++) {
		System.out.println(a[index]);
		}
	}
	public void show(int a,int b,int c) {
		System.out.println(a+" "+ b+" "+" "+c);
	}
}
