package com.bitwise.java.test.elevatortest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.bitwise.java.main.elevator.Floor;
import com.bitwise.java.main.elevator.elevator;


public class elevatortest{

	@Test(expected = elevator.InvalidFloorException.class)
	public void itShouldShowExceptionwhenInCorrectFloorIsSelected() {
		// given
		elevator elevator = new elevator(0);

		// when
		elevator.createQueue(new Floor("-1"));
	}
	
	
	@Test
	public void itShouldDisplayTheCurrentPosition(){
		//given
		elevator elevator = new elevator(0);
		//when
		elevator.createQueue(new Floor("1"));
		elevator.createQueue(new Floor("5"));
		//then
		Assert.assertEquals(5,elevator.currentPosition());
		}
	
	@Test
	public void itShouldMoveToThePressedFloor(){
		//given
		elevator elevator = new elevator(0);
		//when
		
		elevator.createQueue(new Floor("2"),new Floor("3"),new Floor("4"),new Floor("1"),new Floor("0"));
		
	
		
		//then
		Assert.assertEquals(0, elevator.currentPosition());
	}
	
	
	@Test
	public void itShouldWhenMoveUP(){
		//given
		elevator elevator = new elevator(0);
		//when
		elevator.createQueue(new Floor("3"),new Floor("4"),new Floor("1"),new Floor("5"),new Floor("2"));
		
		
		Assert.assertEquals(2,elevator.currentPosition());
		//then
	}
	
	@Test
	public void itShouldQueueWhenMoveDown(){
		//given
		elevator elevator = new elevator(0);
		//when
		elevator.createQueue(new Floor("5"),new Floor("4"),new Floor("1"),new Floor("3"),new Floor("2"));
		
		
		Assert.assertEquals(2,elevator.currentPosition());
		//then
	}
	
	

	@Test
	public void itShouldQueueThefloorInDesendingOrderWhenMoveUP(){
		//given
		elevator elevator = new elevator(0);
		//when
		elevator.createQueue(new Floor("3"),new Floor("4"),new Floor("0"),new Floor("5"),new Floor("2"));
		
		
		Assert.assertEquals(2,elevator.currentPosition());
		//then
	}
	
	@Test
	public void itShouldQueueThefloorWhenMoveDown(){
		//given
		elevator elevator = new elevator(5);
		//when
		elevator.createQueue(new Floor("4"),new Floor("3"),new Floor("0"),new Floor("1"));
		
		
		
		Assert.assertEquals(1,elevator.currentPosition());
		//then
	}
	
	
	
	
	
	
}