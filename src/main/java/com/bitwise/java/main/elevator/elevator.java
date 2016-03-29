package com.bitwise.java.main.elevator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

public class elevator {
   
	 List<Floor> queuemulti = new ArrayList<>();
	 List<Floor> queuemulti2 = new ArrayList<>();
	 int elevatorpos;
	public class InvalidFloorException  extends RuntimeException{
       public InvalidFloorException(){}}
	   public int getElevatorpos() {
	      return elevatorpos;
        }

	  public elevator(int elevatorpos) {
		this.elevatorpos=elevatorpos;
	   }
	  public  int currentPosition() {
		return elevatorpos;}
	

		private void itShouldMoveDown() {
		while(!queuemulti2.isEmpty()){
		elevatorpos=queuemulti2.get(0).getFloor();
		queuemulti2.remove(0);}}
			
	
		

	   private int validateFloor(Floor floor) {
		if((floor.getFloor()<0)||(floor.getFloor()>5)){
			throw new InvalidFloorException();}
		else return floor.getFloor();}
	   public void itShouldMoveUp() {
		elevatorpos=getNextFloor(elevatorpos);
	    moveTheElevator();}
	

	   public int getNextFloor(int elevatorpos2) {
	   elevatorpos=queuemulti.get(0).getFloor();
	   queuemulti.remove(0);
	   return elevatorpos;
	   }
		
	 
		public  void createQueue( Floor... floors) {
		 for (Floor floor : floors) {
			 validateFloor(floor);
			 queuemulti.add(floor);
			 }}
		 	
		
		public Direction calculateDirection() {
			if((queuemulti.get(0).getFloor()-elevatorpos)>0){
				return Direction.UP;
			}
			else{return Direction.DOWN;
			}
		}
	
		public void moveTheElevator() {
			
		while(!queuemulti.isEmpty()){	
		if(calculateDirection()==Direction.UP){
			itShouldMoveUp();
		}
		
		else{
			queuemulti2.add(queuemulti.get(0));
			System.out.println();
			queuemulti.remove(0);}}
		itShouldMoveDown();}}



