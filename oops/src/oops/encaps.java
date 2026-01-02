package oops;



class customer{
	
	
	private int id;
	private String name;
	
	
	public void setData(int id , String name) {
		this.id=id;
		this.name=name;
	}
	
	public int getid() {
		
		
		
		return id;
	
	}
	
	public String  getString() {
		return name;
	}
	
	
}




public class encaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		customer c =new customer();
		
		c.setData(1, "manook");
		System.out.println(c.getid());
		System.out.println(c.getString());
		

	}

}
