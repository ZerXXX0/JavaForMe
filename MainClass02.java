package cloneMethodClone;


public class MainClass02{
	public static void main(String[] args){
		int a = 22;
		int b = increase(a);
		
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		
		Course science = new Course("Physics", "Chemistry", "Biology");
		System.out.println("Before change: " + science.getSubject1());
		Course newScience = changeSubject1(science, "TestMeth");
		System.out.println("After change: " + science.getSubject1());
	}
	
	//call by reference
	private static cloneMethodClone.Course changeSubject1(cloneMethodClone.Course science, String string){
		// TODO Auto-generated method stub
		return null;
	}
	//call by value
	private static int increase(int num){
		// TODO Auto-generated method stub
		num = num + 1;
		return num;
	}
}
