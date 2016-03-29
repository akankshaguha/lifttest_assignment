package com.bitwise.java.main.elevator;

import org.junit.Assert;




public class Main {

	


elevator elevator = new elevator(0);
		public void createQueue(Floor...floors) {
			System.out.println(floors);
			elevator.createQueue(floors);
			elevator.moveTheElevator();
		}
		public void moveTheLift(Floor...floors ) {
			// TODO Auto-generated method stub
			for(Floor floor:floors){
			elevator.createQueue(floor);
		}
			elevator.moveTheElevator();}
		public int currentPosition(){
			return elevator.currentPosition();
		}
		@Override
		public String toString() {
			return "Main [elevator=" + elevator + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + ", toString()="
					+ super.toString() + "]";
		}
		

	

     	
	
	
}



