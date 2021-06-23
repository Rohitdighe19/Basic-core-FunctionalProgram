package com.FunctionalProgram;
import java.util.Scanner;
import java.math.*;
public class Distance {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value of x::  ");
		double x= s.nextDouble();
		System.out.println("Enter value of y::  ");
		double y= s.nextDouble();
		 // Calculating the Euclidean Distance
		
		double Distance = Math.sqrt(x*x + y*y);
		System.out.println("Distance=" + Distance);
		
		
	}

}