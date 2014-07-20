package oop_concepts;

public class Main {

	public static void main(String[] args) {
		Car car = new Car(1999, 120, 230000, "black");
		car.doPowerUpgrade(50);
		System.out.println(car.getPower());
	}

}
