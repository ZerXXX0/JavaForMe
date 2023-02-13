package khususInterface9;

import interfacenya.Movement;
import interfacenya.Vehicle;

public class Car implements Vehicle,Movement{

	@Override
	public void honk(){
		// TODO Auto-generated method stub
		System.out.println("Tiiitt tiiiitt");
	}

	@Override
	public void move(){
		// TODO Auto-generated method stub
		System.out.println("Move yo ass out");
	}
	
}
