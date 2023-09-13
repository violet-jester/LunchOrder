//Food yogurt = new Food(0.69, 2, 0, 1);
//Food chickenBurger = new Food(1.65, 7, 22, 1);
import java.text.DecimalFormat;
import java.util.Scanner;



class Main {
  
  public static void menu(){

  System.out.println("++++++++++++++++++++++");
  System.out.println("Welcome to McDonalds 2");
  System.out.println("++++++++++++++++++++++");
    
  }

  
  
  public static void main(String[] args) {
    System.out.println("LunchOrder lab -  Intro to OOP");

    menu();
    
    
     double total = 0;
    
    
    		
		Scanner input =  new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("#.00");
		
		
		// price , fat, carbs, fiber, calories
	Food CheeseBurger = new Food(1.85, 9, 33, 1, 303);	

	Food VeggieBurger = new Food(1.85, 9, 33, 1, 177);	

  Food yogurt = new Food(0.69, 2, 0, 1, 100);

  Food chickenBurger = new Food(1.65, 7, 22, 1, 247);  

	Food salad = new Food(2.00, 1, 11, 5, 100);

  Food Fries = new Food(1.30, 11, 36, 4, 312);

  Food Ssodas = new Food(0.95, 0, 39, 0, 150);

  Food Msodas = new Food(1.89, 0, 56, 0, 210);

  Food Lsodas = new Food(2.19, 0, 77, 0, 290);

  Food coffeesmall = new Food(1.49, 0, 0, 0, 3);

  Food medcoffee = new Food(1.75, 0, 0, 0, 4);

  Food coffeelrg = new Food(1.99, 0, 0, 0, 5);

  System.out.println("Would you like a Burger with that? Y/N");
  String burgs = input.next();


  if (burgs.equals("Y") ){  


  System.out.println("Enter number of Cheeseburgers: ");
	int CheeseBurgers = input.nextInt();
	System.out.println(CheeseBurger.toString("Cheeseburger"));
	total = total + (CheeseBurger.getPrice() * CheeseBurgers);
	
	System.out.println("Enter number of VeggieBurgers: ");
  int VeggieBurgers = input.nextInt();
  System.out.println(VeggieBurger.toString("VeggieBurgers"));
  total = total + (VeggieBurger.getPrice() * VeggieBurgers);

  System.out.println("Enter number of Chicken Burgers: ");
  int ChickenBurgers = input.nextInt();
  System.out.println(chickenBurger.toString("Chicken Burgers"));
  total = total + (chickenBurger.getPrice() * ChickenBurgers);
	
  }//end burger


  System.out.println("Enter number of Salads: ");
  int salads = input.nextInt();
	System.out.println(salad.toString("salad"));
  total = total + (salad.getPrice() * salads);

  System.out.println("Enter number of Yogurts: ");
  int yogurts = input.nextInt();
	System.out.println(yogurt.toString("yogurt"));
  total = total + (yogurt.getPrice() * yogurts);


  System.out.println("Enter number of Fries: ");
  int Frieses = input.nextInt();
	System.out.println(Fries.toString("Fries"));
  total = total + (Fries.getPrice() * Frieses);


  System.out.println("Would you like a drink with that? Y/N");
  String drink = input.next();


  if (drink.equals("Y") ){
    
    
  System.out.println("Enter number of Small Sodas: ");
  int sodassm = input.nextInt();
	System.out.println(Ssodas.toString("small soda"));
  total = total + (Ssodas.getPrice() * sodassm);

  System.out.println("Enter number of Med Sodas: ");
  int sodasm = input.nextInt();
	System.out.println(Msodas.toString("medium soda"));
  total = total + (Msodas.getPrice() * sodasm);

  System.out.println("Enter number of Large Sodas: ");
  int sodasl = input.nextInt();
	System.out.println(Lsodas.toString("large soda"));
  total = total + (Lsodas.getPrice() * sodasl);

  System.out.println("Enter number of small Coffees: ");
  int scoffee = input.nextInt();
	System.out.println(coffeesmall.toString("small coffee"));
  total = total + (coffeesmall.getPrice() * scoffee);

  System.out.println("Enter number of Medium Coffees: ");
  int mcoffee = input.nextInt();
	System.out.println(medcoffee.toString("med coffee"));
  total = total + (medcoffee.getPrice() * mcoffee);

  System.out.println("Enter number of large Coffees: ");
  int lcoffee = input.nextInt();
	System.out.println(coffeelrg.toString("large coffee"));
  total = total + (coffeelrg.getPrice() * lcoffee);
    
  }//end drink

	System.out.println("Your total is: $ " + format.format(total));
	
	
	input.close();



	}// end main
    
    
  
}// end class


