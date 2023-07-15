package practise;

class Students{
	
	String name;
	int rollNo;
	
	Students(String studName,int studRollNo){
		this.name=studName;
		this.rollNo=studRollNo;
	}
	
	public String toString() {
		return "Student [ name: "+name+"    rollNo: "+rollNo+" ]";
	}
}
public class ArrayOfObjects {
	
	public static void main(String...args) {
	Students s=new Students("Lilly",003);
	Students s1=new Students("Geetha",004);
	
	/*
	 * System.out.println(s); System.out.println(s1);
	 */
	
	Students[] stud=new Students[4];
	stud[0]=s;
	stud[1]=s1;
	stud[2]=new Students("Ram",11);
	stud[3]=new Students("Seetha",23);
	
	for(Students eachStudent:stud) {
		System.out.println(eachStudent);
		
	}
	
	
	}

}

