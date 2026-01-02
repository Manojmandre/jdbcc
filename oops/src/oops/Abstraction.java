package oops;




abstract class plane{
	abstract void takeoff();
	abstract void takeup();
	abstract void land();
	
	public void disp() {
		System.out.println("");
	}
	
}

class carplane extends plane{
	
	void takeoff() {
		System.out.println("carplane can fly");
		
	}
	void takeup() {
		System.out.println("takup");
	}
	
	
}





public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
