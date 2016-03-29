package com.bitwise.java.main.elevator;



import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Floor {

	
	
	private int floor;
	

	

	@Override
	public String toString() {
		return "Floor [floor=" + floor + "]";
	}




	public Floor(String floor) {
		try{
			int floor1=Integer.parseInt(floor);
		this.floor=floor1;
		}
		catch(Exception e){
			
		}
		
	
	}

	



	public int getFloor() {
		return this.floor;
	}










		
	
	
	
		
	
	


	

	

	
	
	
	
	
	
	
	
	
	
}





