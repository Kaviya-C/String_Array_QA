package practise;

class Student{
	
	int rollNo;
	String name;
	
	Student(String studName,int studRollNo){
		this.name=studName;
		this.rollNo=studRollNo;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
}

public class StringConcept {
	public static void main(String...args) {
		Student s=new Student("kaviya",41);
		System.out.println(s);
		System.out.println(s.name+"  "+s.rollNo);
	}

}
