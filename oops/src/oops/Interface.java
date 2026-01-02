package oops;




interface calcaluator{
	void add();
	void sub();
}

class cal implements calcaluator{
	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("add is done");
		
	}
	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("sub is done");
		
	}
	
}

class cal2 implements calcaluator{
	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println(" add is going on");
		
	}
	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println(" sub id=s going on");
		
	}
}


public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		cal c=new cal();
		cal2 d=new cal2();
		c.add();
		c.sub();
		d.add();
		d.sub();
	}

}
