package practise;

public class ArrayDescendingSort {
	static int x=2;
	public static void main(String...args) {
		
		int[] array=new int[] {4,3,1,6,4,3,6,4};
		
		int[][] newArray=new int[array.length][2];
		
		array=sort(array);
       
		newArray[x][0]=array[0];
		for(int index=0;index<array.length;index++) {
		if(array[index]==array[index-1]) {
			newArray[x][1]=newArray[x][1]+1;
		}
		else
			x++;
		newArray[x][0]=array[index];
		}
		x++;
		newArray=sort(newArray);
		
	}
	public static int[][] sort(int b[][]){
		int[] c=new int[2];
		//for(int indev  )
		
		return b;
	}
	public static int[] sort(int a[]) {
		for(int index=0;index<a.length;index++) 
		{
			for(int col=index;col<a.length;col++) 
			{
				if(a[index]>a[col]) {
					a[index]=a[index]+a[col];
					a[col]=a[index]-a[col];
					a[index]=a[index]-a[col];
				}
			}
		}
		
		return a;
	}

}
