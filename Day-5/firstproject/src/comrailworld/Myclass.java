package comrailworld;

public class Myclass {
	
	int i=20;
	public static int p=89;
	
	public void func() {
		System.out.println("hello from non static My class");
		System.out.println(i);
	}
	 public static void func1() {
		 System.out.println("world");
		 System.out.println(Myclass.p);
		 Myclass obj2=new Myclass();
		 System.out.println(obj2.i);
	 }

}
