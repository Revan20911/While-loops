import java.util.*;
public class weight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float months = 0;
		float weight=0;
		System.out.println("What is your weight? ");
		Scanner sc = new Scanner(System.in);
		weight = sc.nextFloat();
		
		
		if(weight < 0) {
			System.out.println("Weight can not be negative");
		}
			while (weight < 0) {
			System.out.println("Please enter a positive number: ");
			weight = sc.nextFloat();
			}	
			if (weight > 0) {
			
		}
		
		while (months <= 6) {
			float weightl = weight - (months*4);
			months+=1;
			System.out.println("Your new weight is "+weightl+" lbs.");
			System.out.println("You lost "+(weight-weightl)+" lbs.");
			
		}

}
}
