import java.util.Scanner;
public class MovieBuzz 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        while (true) 
        {
            System.out.print("Enter Your Hero: ");
            
            String hero = scanner.nextLine().toLowerCase();
            if (hero.equals("exit")) 
            {
                System.out.println("Exiting MovieBuzz.");
                break;
            }
            switch (hero) 
            {
                case "movie":
                    System.out.println("bala");
                    System.out.println("chiru");
                    System.out.println("balaya");
                    break;
                case "bala":
                    System.out.println("bala 1");
                    System.out.println("bala 2");
                    System.out.println("bala 3");
                    break;
                case "chiru":
                    System.out.println("chiru 1");
                    System.out.println("chiru 2");
                    System.out.println("chiru 3");
                    System.out.println("chiru 4");
                    break;
                case "balaya":
                    System.out.println("bala 1");
                    System.out.println("bala 2");
                    System.out.println("bala 3");
                    break;
                default:
                    System.out.println("Sorry, no movies found for the hero: " + hero);
                    break;
            }

            System.out.println(); 
        }

        scanner.close();
    }
}


