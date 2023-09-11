import java.text.DecimalFormat;
import java.util.Scanner;



class Main {
  
 
  
  public static void main(String[] args) {
    System.out.println("LunchOrder lab -  Intro to OOP");
    
    
     double total = 0;
    
    
    		
		Scanner input =  new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("#.00");
		
		
		// price , fat, carbs, fiber
	Food burger = new Food(1.85, 9, 33, 1);	
	
	Food salad = new Food(2.00, 1, 11, 5);

  Food Fries = new Food(1.30, 11, 36, 4);

  Food Sodas = new Food(0.95, 0, 38, 0);

  Food coffee = new Food(0.95, 0, 38, 0);

	System.out.println("Enter number of burgers: ");
	int burgers = input.nextInt();
	System.out.println(burger.toString("burger"));
	total = total + (burger.getPrice() * burgers);
	
	
	System.out.println("Enter number of Salads: ");
  int salads = input.nextInt();
	System.out.println(salad.toString("salad"));
  total = total + (salad.getPrice() * salads);



  System.out.println("Enter number of Fries: ");
  int Frieses = input.nextInt();
	System.out.println(Fries.toString("Fries"));
  total = total + (Fries.getPrice() * Frieses);


  System.out.println("Enter number of Sodas: ");
  int sodases = input.nextInt();
	System.out.println(Sodas.toString("soda"));
  total = total + (Sodas.getPrice() * sodases);

	

	System.out.println("Your total is: $ " + format.format(total));
	
	
	input.close();



	}// end main
    
    
  
}// end class


