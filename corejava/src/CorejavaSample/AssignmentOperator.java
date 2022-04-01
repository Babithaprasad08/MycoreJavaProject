package CorejavaSample;

import java.util.Scanner;

public class AssignmentOperator {

	public static void main(String[] args) {
		
		int age;
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		
		if ( age > 0 && age <= 2)
		{System.out.println( "infant");}
		else if (age > 2 && age <= 12)
		{System.out.println( "Child");}
		else if (age > 12 && age <= 25)
		{System.out.println( "youth");}
		else if (age > 25 && age <= 59)
		{System.out.println( "Adult");}
		else if (age > 59 && age <= 100)
		{System.out.println("Senoir Citizen");	}	
		
					

	}

}
