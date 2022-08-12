package jul22.week2.day7_8.Polymorph_Abstract;

public interface Mobile {
	
	//unimplemented method i.e., without any body
	//In Interface all the methods are public abstract 
	//Cannot have private or protected abstract
	void takeVideo();
	
	void touchScreen();
	
	//Cannot create object for interface
}
