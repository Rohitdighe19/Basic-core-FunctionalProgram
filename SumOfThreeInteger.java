package com.FunctionalProgram;


import java.util.Scanner;

public class SumOfThreeInteger {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of your array: ");
		int number = sc.nextInt();
		int array[] = new int[number];
		System.out.println("Enter the unique array values: ");
		for (int i =0; i < array.length; i++) {
			array[i] =sc.nextInt();
		}
		
		findTriplets(array,number);
		
	}
	private static void findTriplets(int[] array, int number) {
		boolean found = false;
		for (int i =0; i < number - 2; i++) {
			for  (int j = i + 1; j < number - 1; j++) {
				for (int k =j + 1; k < number; k++) {
					if (array[i] == array[j] && array[i] == array[k] && array[j] == array[k])
						break;
					else {
						if (array[i] + array[j] + array[k] == 0) {
							System.out.print("Numbers Found: ");
							System.out.print(" ");
							System.out.print(array[i]);
							System.out.print(" ");
							System.out.print(array[j]);
							System.out.print(" ");
							System.out.print(array[k]);
							System.out.print("\n");
							found = true;
							return;
							
						}
					}
				}
				
				
			}
		}
		if (found == false)
			System.out.println("Triplet not found! check the input array!";)
	}
}

