package oops;







class Test1 extends Object{
	int x;
	int y;
	 
	Test1(){
		super();
		x=100;
		y=200;
	}
	
	Test1 (int x,int y){
		this.x=x;
		this.y=y;
	}
}
class Test2 extends Test1{
	int a;
	int b;
	
	
	Test2(){
		super();
		a=20;
		b=23;
		
	}
	Test2 (int a,int b){
		this.a=a;
		this.b=b;
		
		
	}
	void disp() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
	}
}






public class Inhertance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 b=new Test2();
		b.disp();

	}

}
