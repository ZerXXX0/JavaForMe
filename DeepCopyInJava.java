package copyConstructorClone;

public class DeepCopyInJava{
	public static void main(String[] args){
		Course science = new Course("Physics", "Chemistry", "Biology");
		Student student1 = new Student(111, "Joker", science);
		Student student2 = null;
		try{
			student2 = (Student) student1.clone();
		}
		catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		//print student 1
		System.out.println("before: " + student1.course.subject3);
		//changing subject 3 of student 2
		student2.course.subject3 = "Meth";
		//after changes
		System.out.println("After changes: " + student1.course.subject3);
	}
}
