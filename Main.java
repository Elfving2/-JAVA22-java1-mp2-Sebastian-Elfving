import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
   Product itemOne = new Product("Chicken", 2139, 6);
   Product itemTwo = new Product("Balloons", 24,3);
   Discount itemThree = new Discount("Pringles",100, 36, 0.3);
   Customer c = new Customer(0);

    Scanner sc = new Scanner(System.in);

    boolean isRunning = true;
    while(isRunning) {
      System.out.println("1. Buy " + itemOne.getName() + ", " + itemOne.getCost()+ " SEK, " + itemOne.getItemsLeft() + " left");
      System.out.println("2. Buy " + itemTwo.getName()  + ", " + itemTwo.getCost() + " SEK, " + itemTwo.getItemsLeft() + " left");
      System.out.println("3. Buy " + itemThree.getName()  + ", " + itemThree.getCost() +  " SEK, " + itemThree.getItemsLeft() + " left");
      System.out.println("4. Quit");
      System.out.print("Choose your option: ");

     int input = sc.nextInt();

     switch(input) {
       case 1:
         if (input == 1) {
            itemOne.itemsLeft();
            c.itemsBought();
           c.addToCart(itemOne.getCost());
            break;
         }
       case 2:
         if (input == 2) {
           itemTwo.itemsLeft();
           c.itemsBought();
           c.addToCart(itemTwo.getCost());
         }
       case 3:
         if (input == 3) {
           itemThree.itemsLeft();
           c.itemsBought();
           c.addToCart(itemThree.getCost());
         }
       case 4:
         if(input == 4) {
           c.get_itemsBought();
           c.addToCartSum();
           isRunning = false;
         }
     }
   }
  }
}