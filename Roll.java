import java.util.Scanner;
import java.util.Random;


public class Roll
{
   public static void main(String[] args)
   {
    System.out.println("Roll Dice!");
    char repeat;

    do {
    System.out.print("\nWhat die do you need to roll? ");
    
   
    Scanner in = new Scanner(System.in);
    while (!in.hasNextInt())
    {
      System.out.print("Invalid number. What do you need to roll?  ");
        in.next();    
    }

    
    int num = in.nextInt();
    int roll = num;

    Random rand = new Random();
    int result = rand.nextInt(roll) + 1; 

    System.out.print("Enter your modifiers: ");
    in = new Scanner(System.in);
    while (!in.hasNextInt())
    {
      System.out.print("Invalid number. What is your modifier?  ");
      in.next();
    }


    num = in.nextInt();
    int mod = num;
    
    System.out.println("\nYou rolled: " + result);
    System.out.println("Your modifier: " + mod);
    System.out.println("Your total: " + (result + mod));

    System.out.print("\nWould you like to roll again? (Y/y to roll again)  ");
    
    in = new Scanner(System.in);
    repeat = in.next(".").charAt(0);

  
    if (repeat != 'Y' || repeat != 'y' )
        System.exit(0);

    }while(repeat == 'Y' || repeat == 'y');

    
    }
}