package codedecode.java8;

interface Interf
{
	public default void m1()
	{
		System.out.println("Hello Default method");
	}
}

public class DefualtethodDemo implements Interf {

	public static void main(String[] args) {
		DefualtethodDemo d=new DefualtethodDemo();
		d.m1();
		

	}

}
