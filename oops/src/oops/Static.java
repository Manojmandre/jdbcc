package oops;

import java.util.Scanner;


class Bussiman{
	
	  float si;
	  float t;
	  static  float r;
	  float p;
	  
	  static {
		  r=1.2f;
		  
	  }
	  void Acceptinput() {
		  System.out.println("enter the p and t");
		  Scanner scan=new Scanner(System.in);
		  p=scan.nextFloat();
		  t=scan.nextFloat();
		  
	  }
	  void calcualte() {
		  si=p*t*r/100;
		  
	  }
	  void display() {
		  System.out.println(si);
	  }
	
	  
	  
	  
	}

public class Static {

	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bussiman b=new Bussiman();
		b.Acceptinput();
		b.calcualte();
		b.display();

	}

}
