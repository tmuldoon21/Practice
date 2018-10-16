import java.util.Scanner;

public class Cube 
{

	public static void main(String[] args) 
	{
		Scanner eggs = new Scanner(System.in);
		System.out.print("Please enter your name:  ");
		String name;
		name = eggs.nextLine();
		System.out.print("\n\nHello, " + name + ", welcome to the Cube Calculator");	
		System.out.println("\nPress enter to continue...");
		eggs.nextLine();
		System.out.println("Volume of a cube ");
		System.out.print("Please enter the side length: ");
		String baseStr = eggs.nextLine();
		
		
		double sidelength;
		sidelength = Double.parseDouble(baseStr); 
		System.out.print("Please enter the unit of measure: ");
		String unit = eggs.nextLine();
		double volume = sidelength*sidelength*sidelength;
		System.out.println("The volume of the cube is " + volume +" " + unit + "^3");
		

	}

}
