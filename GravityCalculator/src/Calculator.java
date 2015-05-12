
class GravityCalculator {
	
	//Objective: Create a program that computes the distance an object will fall in Earth's gravity
	
	public static void main(String[] arguments) {
		double gravity = -9.81; // Earth's gravity in m/s^2 double initialVelocity = 0.0;
		double fallingTime = 10.0;
		double initialPosition = 0.0;
		double initialVelocity = 0.0;
		//Calculate the finalPosition using the following equation: x(t) = 0.5 × at2 + vit + xi
		double finalPosition = 0.5*(gravity*Math.pow(fallingTime,2))+(initialVelocity*fallingTime)+initialPosition;
		System.out.println("The object's position after " + fallingTime +
		" seconds is " + finalPosition + " m."); 
	}
}


//Initial output: "The object's position after 10.0 seconds is 0.0 m.""