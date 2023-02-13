package copyConstructorClone;


public class Student implements Cloneable{
		int id; 
	    String name;
	    Course course;
	    
	    //copy constructor
	    public Student(Student studentToBeCopied){
	    	this.id = studentToBeCopied.id;
	    	this.name = studentToBeCopied.name;
	    	this.course = new Course(studentToBeCopied.course);
	    }
	    
	    //constructor
	    public Student(int id, String name, Course course){
	    	this.id = id;
	    	this.name = name;
	    	this.course = course;
	    }
	    @Override
		protected Object clone() throws CloneNotSupportedException{
	    	Student student = (Student) super.clone();
	    	student.course = (Course) course.clone();
	    	return student;
	    }
}
