package oop_concepts;

import java.util.Calendar;

public class Car implements UpgradeableCar{
	private int productionYear = 0;
	private int power = 0;
	private int distanceTraveled = 0;
	private String color = "none";
	
	private int id;
	private static int numberOfCars = 0;
	
	public Car(int inProductionYear, int inPower, int inDistance, String inColor){
		this.setProductionYear(inProductionYear);
		this.setPower(inPower);
		this.setDistanceTraveled(inDistance);
		this.setColor(inColor);
		
		this.id = ++numberOfCars;
	}
	
	public int getId(){
		return this.id;
	}
	
	public static int getNumberOfCars(){
		return numberOfCars;
	}
	
	public int getProductionYear() {
		return this.productionYear;
	}
	
	public void setProductionYear(int inProductionYear) {
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		
		if(inProductionYear > 1900 && inProductionYear <= currentYear){
			this.productionYear = inProductionYear;
		}
		else{
			System.out.println("Invalid year");
		}
	}
	
	public int getPower() {
		return this.power;
	}
	
	public void setPower(int inPower) {
		if(inPower > 0){
			this.power = inPower;
		}
		else{
			System.out.println("Invalid power");
		}
	}
	
	public int getDistanceTraveled() {
		return this.distanceTraveled;
	}
	
	public void setDistanceTraveled(int inDistanceTraveled) {
		if(inDistanceTraveled > 0){
			this.distanceTraveled = inDistanceTraveled;
		}
		else{
			System.out.println("Invalid distance");
		}
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String inColor) {
		if(inColor != null){
			this.color = inColor;
		}
		else{
			System.out.println("Invalid color");
		}
	}

	public void doPowerUpgrade(int addedPower) {
		this.power += addedPower;
	}
	
	
}
