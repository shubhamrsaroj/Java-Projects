package JavaAllProjects;

import java.util.random.*;
import java.util.*;

public class Random{
	
	public static  int chance=0;
	public static String ask;
	public String f1;
	public String f2;
	public String f3;
	public String f4;
	public int score=0;
	public int  takerandom;
	public int  take;
	public int round=0;
	
	
	public void scoree() {
		System.out.println("You have played "+round+"rounds and your score is "+score);
	}
	
	public int Random() {	
		Random no=new Random();
     	int min = 1;
        int max = 100;
        // Generate a random number within the range
        int randomNumberInRange = Math.abs(no.nextInt(max - min + 1) + min);
        
	    return randomNumberInRange;
	}
	
	 public void call() {
		
		 System.out.println("Let's play for 3 rounds more");
		 chance++; 
		 
		 if(chance<=3) {
			 Chances();
			 
		 }
		 
		 else {
			 System.out.println("Stop");
		 }
		 scoree();
	 }
	 
	 
	 
      public void Chances() {
    	  round+=1;
    	 
		int noo=3;		
		
		
		for(int i=1;i<=noo;i++) {		
		
			
		Scanner sc=new Scanner(System.in);
		System.out.println("Please choose the value from 1-100 :You have got 3 chances");
		if(i==1) {
			System.out.println("1/3 Chance Done");
		}
		else if(i==2){
			System.out.println("2/3 Chance Done");
				
		}
		else if(i==3){
			System.out.println("Last chance"  
					);
				
		}
		else {
			System.out.println("Thank you for playing ");
		}
		int take=sc.nextInt();
     	System.out.println("User guessed no is"+take);
     	//
    
     	int takerandom=Random();
     	System.out.println("The random no is"+takerandom);
        
     	//
         
     	 if((takerandom>take)&(take<=100)) {
     		  
         	  int check=takerandom-take;
         	  if(check>take) {
           	  String f1="high";	  
         		  System.out.println(f1);
         		  score+=0;
         		  
           	  }
         	  else {
         		String f2="low";	
         		  System.out.println(f2);
         		  score+=1;
         	  }
              
         System.out.println("\n");
         }
         
         else  if((takerandom<take)&(take<=100)) {
         	int sno=take-takerandom;
         	if(sno>takerandom) {
         		String f3="high";	
       		  System.out.println(f3);
       		  score+=0;
               
         	}
         	else {
         		String f4="low";	
         		System.out.println(f4);
         		score+=1;
         	}
		    
		  
       	
       }	          call();			
				 
        }

      }

   public static void main(String[] args) {
       Random s=new Random();
       System.out.println("Welcome to the Number Guessing Game! \n"
				+ "Objective: Choose a number between 1 and 100.\n"
				+ "Scoring: You'll score 1 point if you're close to the secret number, 0 points otherwise.\n"
				+ "Let's Begin: Take a moment, trust your instincts, and pick your number!\n"
				+ "Ready? Let the guessing begin!");
       s.Chances();
        
}

}
