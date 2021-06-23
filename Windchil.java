package com.FunctionalProgram;
import java.util.Scanner;

public class Windchil {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter temprature t::");
		double t= s.nextDouble();
		System.out.println("Enter WindSpeed v::");
	    double v= s.nextDouble();
	    
	    if(t<= 50 && 3 <= v && v <= 120) {
	    double w= 35.74+0.625*t+(0.4275*t-35.75)*Math.pow(v,0.16);
	      
	    System.out.println(w);
	    }
	    else {
	    	System.out.println("Please Enter correct values");
	    }
	
	}
	

}