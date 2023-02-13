package copyConstructorClone;


public class Course implements Cloneable{
	String subject1; 
    String subject2;
    String subject3;
    
    //copy constructor
    public Course(Course courseToBeCopied){
    	this.subject1 = courseToBeCopied.subject1;
    	this.subject2 = courseToBeCopied.subject2;
    	this.subject3 = courseToBeCopied.subject3;
    }
    
    //constructor
    public Course(String sub1, String sub2, String sub3){
    	this.subject1 = sub1;
    	this.subject2 = sub2;
    	this.subject3 = sub3;
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException{
    	return super.clone();
    }
}

