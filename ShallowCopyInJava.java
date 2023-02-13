package cloneMethodClone;


public class ShallowCopyInJava{
	public static void main(String[] args){
		Course science = new Course("Physics", "Chemistry", "Biology");
		Student student1 = new Student(111, "John", science);
        Student student2 = null;
        
        try{
        	student2 = (Student) student1.clone();
        }
        catch (CloneNotSupportedException e){
        	e.printStackTrace();
        }
        //print subject 3 student 1 before change
        System.out.println("Before: " + student1.course.subject3);
        //change
        student2.course.subject3 = "Meth";
        //after change
        System.out.println("After: " + student1.course.subject3);
	}
}
