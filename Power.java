import java.util.Scanner;
public class Power {

	
	public static void main(String[] args) {
	
		Scanner userinput = new Scanner(System.in);
		
		//User inputs
		System.out.println("Pleae input first number");
		Double InputA = userinput.nextDouble();
		
		System.out.println("Pleae input second number");
		Double InputB = userinput.nextDouble();
		
		Double Sum = 0.0;	
		//Small representation of the power function in Java
		if (InputA == InputB) {
			System.out.println( "Your Sum is: " + (Sum = (InputA*InputB)/((InputB-InputA)*2)));
			System.out.println("Your power is: " + (Math.pow(Sum, 2)));
		} else if (InputA > InputB) {
			System.out.println( "Your Sum is: " + (Sum = ((InputB*InputB)/(InputA-InputB))));
			System.out.println("Your power is: " + (Math.pow(Sum, 2)));
		} else if (InputA < InputB) {
			System.out.println( "Your Sum is: " + (Sum = (InputA*InputA)/(InputB+InputB)));
			System.out.println( "Your power is: " + (Math.pow(Sum, 2)));
		}		
		userinput.close();
    
	}

}
