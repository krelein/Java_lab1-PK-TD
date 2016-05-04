package pl.edu.pwr.pp;

import java.util.Random;
import java.time.LocalDateTime;


public class Horoskop {
	
	public int healthIndex(String name){
		return name.length() % 12;
	}
	
	public int loveIndex(){
		return  (LocalDateTime.now().getDayOfMonth() -1) % 12; 
	}
	
	public int workIndex(){
	int result = (new Random().nextInt()) % 12;
		return result >= 0 ? result : -result;
	}
	
}



