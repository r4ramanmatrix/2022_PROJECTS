package classesAndobjects;

public class Car {
	
	String sModel;
	
	int iGear;
	
	int iHighSpeed;
	
	String sColor;
	
	int iTyres;
	
	int iDoors;
	
	public void DisplayCharacteristics() {
		System.out.println("Model of the car: " + sModel);
		
		System.out.println("Color of the car: " + sColor);
		
		System.out.println("High Speed of the car: " + iHighSpeed);
		
		System.out.println("Gears in the car: " + iGear);
		
		System.out.println("Doors in the car: " + iDoors);
		
		System.out.println("Tyres in the car: " + iTyres);
	}

}
