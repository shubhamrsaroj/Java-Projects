package JavaAllProjects;

import java.util.Scanner;
public class Student {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks for Subject physics");
		double physics=sc.nextDouble();
		System.out.println("Enter marks for Subject Chemistry");
		double chemistry=sc.nextDouble();
		System.out.println("Enter marks for Subject Maths");
		double Maths=sc.nextDouble();
		System.out.println("Enter marks for Subject English");
		double English=sc.nextDouble();
		System.out.println("Enter marks for Subject Biology");
		double Biology=sc.nextDouble();
		
		double avg=physics+chemistry+Maths+English+Biology;
		System.out.println("Your total marks"+avg);
		double marks=avg/5;
		System.out.println("You average percentage is "+ marks +"%");
	    if((marks>=90)&(marks<=100)) {
	    	System.out.println("A+");
	    }
	    else if((marks>=85)&(marks<=89)) {
	    	System.out.println("A");
	    }
	    else if((marks>=80)&(marks<=84)) {
	    	System.out.println("A-");
	    }
	    else if((marks>=75)&(marks<=79)) {
	    	System.out.println("B+");
	    }
	    else if((marks>=70)&(marks<=74)) {
	    	System.out.println("B");
	    }
	    else if((marks>=65)&(marks<=69)) {
	    	System.out.println("C+");
	    }
	    else if((marks>=60)&(marks<=64)) {
	    	System.out.println("C");
	    }
	    else if((marks>=55)&(marks<=59)) {
	    	System.out.println("D+");
	    }
	    else if((marks>=50)&(marks<=54)) {
	    	System.out.println("D");
	    }
	    else if((marks>=40)&(marks<=49)) {
	    	System.out.println("E");
	    }
	    else if((marks>=0)&(marks<=39)) {
	    	System.out.println("F");
	    }
	    else {
	    	System.out.println("Enter your marks");
	    }
	    
	    
	    
	    
	    
		
		
		
	}

}

