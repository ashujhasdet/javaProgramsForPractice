package logicalPrograms;
import java.util.Scanner;
/* A java program to find factors of a Positive integer number. We will take number at run time 
   from user as input.
   Factors means the numbers which can divide the given number properly.
   example: Factors of 6 are: 1,2,3,6
 
 */

public class FactorsOfNumber {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		//To take the input from user at run time we need to import Scanner class
		//and create a new object example sc(anything you want you can name it). 
		Scanner sc = new Scanner(System.in);
		//we can ask the user to run the program any number of time, so we will use a loop
		boolean exit =true;//for while loop below
		while(exit) {
			System.out.println("\nEnter your choice\n1.Find Factors\n2.Exit the program\n");
			int choice =sc.nextInt();
			switch(choice) {
			case 1:{System.out.println("Please Enter a positive integer number\n");
			        int num = sc.nextInt();
			        System.out.println("Factors of "+ num + " are \n");
			        fact(num);//now fact method will execute and print  factors
				
	                }break;
			case 2: {exit =false;
			          System.out.println("Thank You\n Exit success");
			                     
			         }break; 
			         
			 default:{System.out.println("Plaese Enter a Vaild Input ");}        
			
			
			}
		}
		
		System.out.println("Main Ends");
		
	}
	
	
	//method to find factors
	public static void fact(int num) {
		//above method will accept the number given by user as parameter.
		//LOGIC 
		/*  
		 We know that maximum factor of a number will be less than or equal to
		 the given number itself.So we can run a loop from  1 to that number and 
		 can check which numbers are required factors for our given number.
		    */
		for(int i =1;i<=num;i++) {
			//Note: do not start division with 0 
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}
		
		
		
	}

}
