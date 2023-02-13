package khususInterface9;

import interfacenya.Movement;
import interfacenya.Vehicle;

public class Bus implements Vehicle,Movement{

	@Override
	public void honk(){
		// TODO Auto-generated method stub
		System.out.println("Tooott tooott");
	}

	@Override
	public void move(){
		// TODO Auto-generated method stub
		System.out.println("Move byatch outta way");
	}
	
}
