package lecture_15.middle.FlyingObject;

public class Plane implements CanFly{
	
	private int numberOfPassenger;
	
	public void fly() {
		System.out.println("The plane can fly");
	}
	
	public Plane(int numberOfPassenger) {
		this.numberOfPassenger = numberOfPassenger;
	}

}
