package codedecode.java8;

public interface DiamondInterf1 {
	
	default void m1()
	{
		System.out.println("default 1");
	}
	
	static void m2()
	{
		System.out.println("Static demo");
	}

}
