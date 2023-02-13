package khususInterface9;

import interfacenya.Movement;
import interfacenya.Vehicle;

public class Truck implements Vehicle,Movement{

	@Override
	public void honk(){
		// TODO Auto-generated method stub
		System.out.println("Teeeeeet telolet");
	}

	@Override
	public void move(){
		// TODO Auto-generated method stub
		System.out.println("Hell outta here");
	}
	
}
