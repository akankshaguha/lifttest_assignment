package com.bitwise.java.test.elevatortest;

import junit.framework.Assert;

import org.junit.Test;

import com.bitwise.java.main.elevator.Floor;
import com.bitwise.java.main.elevator.Main;
import com.bitwise.java.main.elevator.elevator;

public class Maintest {
	
	
	
	
	
	
	elevator elevator=new elevator(0);
	
	@Test
	public void itShouldExcecuteTheLift(){
		Main main = new Main();
		main.moveTheLift(new Floor("1"),new Floor("2"),new Floor("0"),new Floor("5"));
		main.moveTheLift(new Floor("3"),new Floor("1"));
		main.moveTheLift(new Floor("2"),new Floor("3"),new Floor("4"),new Floor("1"),new Floor("5"));
		main.moveTheLift(new Floor("4"));
		
	Assert.assertEquals(4, main.currentPosition());
	}

	@Override
	public String toString() {
		return "Maintest []";
	}

}
