package copyConstructorClone;

public class Major implements Cloneable{
	Student classRepresentative;
	
	public Major (Student newStudent){
		this.classRepresentative = newStudent;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		Major major = (Major) super.clone();
		major.classRepresentative = (Student) this.classRepresentative.clone();
		return major;
	}
}
