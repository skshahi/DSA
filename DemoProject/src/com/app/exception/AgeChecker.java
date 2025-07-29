package com.app.exception;

public class AgeChecker {

	public static void main(String[] args) {
	 int age=25;
	 if(age<30)
	 {
		 throw new CustomizedExceptionClass("You are not eligible for marriage");
	 }else{
		 System.out.println("Do Marriage");
	 }
	 

	}

}
