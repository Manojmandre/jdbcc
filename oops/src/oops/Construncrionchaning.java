package oops;

public class Construncrionchaning {
	private int id;
	private String name;
	
	public Construncrionchaning() {
		 id=1;
		  name="manoj";
	}
	
	public Construncrionchaning(int id, String name) {
		this();
	}
	
	
	
	public int getid() {
		return id;
	}
	public String getname() {
		return name;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Construncrionchaning  c=new  Construncrionchaning ();
		  c.Construncrionchaning(1,"manoj");
		  c.getid();
		  c.getname();
		
	}

}
