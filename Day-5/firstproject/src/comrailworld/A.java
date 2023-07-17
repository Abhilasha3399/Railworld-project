package comrailworld;

public class A {
	int i=12;
	A(){
		System.out.println("hello constructor");
	}
	
	public static int r=23;
	public static void main(String[]args) {
		int p=20;
		A a1=new A();
		System.out.println(a1.i);
		System.out.println(p);
		System.out.println(r);
		
	}

}
