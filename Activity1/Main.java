package Main;

import java.util.Scanner;

public class Main {
	  public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

		  	System.out.println("----------------------");
	        System.out.print("Enter a number: ");
	        int num = scanner.nextInt();


	        if (num > 0) {
	            System.out.println("Number " + num + " is positive");
	        } else if (num < 0) {
	            System.out.println("Number " + num + " is negative");
	        } else {
	            System.out.println("Number is zero");
	        }

	     
	        int add = num + 100;      
	        int subtract = num - 1;  
	        int multiply = num * 10; 
	        double divide = num / 2.0;  

	        System.out.println("After adding 100: " + add);
	        System.out.println("After subtracting 1: " + subtract);
	        System.out.println("After multiplying by 10: " + multiply);
	        System.out.println("After dividing by 2.0: " + divide);
	        System.out.println("----------------------");
	  }
	}
