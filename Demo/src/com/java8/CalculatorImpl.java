package com.java8;

interface Calculator
{
	//way1
//	public void switchOn();
	//way2
	//void sum(int n);
	int substract(int i,int j);
}

public class CalculatorImpl {

	public static void main(String[] args) {
		/*Calculator c=()->{
			System.out.println("Switch On");
		};		
		c.switchOn();*/
		//way2
		/*Calculator c=(n)->System.out.println("Sum:"+n);
		c.sum(10);*/
		
		//way3
		Calculator c=(int i,int j)->{
			return j-i;
		};		
		int sub=c.substract(10, 30);
		System.out.println("Sub:"+sub);
		Calculator c1=(i,j)->j-i;
		
		System.out.println(c1.substract(8, 15));
		

	}

}
