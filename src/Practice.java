import java.util.Scanner;

public class Practice 
{

	public static void main(String[] args) 
	{
		//printing
		System.out.print("I know how to print");
		
		//printing the value of a variable
		int value = 5;
		double decimals = 0.01;
		String sentence = "wow i can do this";
		
		System.out.print(" \n This is my variable: " + value + "\n this is my double variable: " + decimals + "\n This is my string: " + sentence);
		value += 30;
		decimals -= 25;
		sentence = sentence + "more stuff";
		
		System.out.println("value: " + value); //num:40
		
		Scanner koosha = new Scanner (System.in);
		
		System.out.print("What is your favorite sport:  ");
		String favSport = koosha.nextLine();
		System.out.print("\nYour favorite sport is " + favSport + ", and mine is basketball");
		
				
	}

}
