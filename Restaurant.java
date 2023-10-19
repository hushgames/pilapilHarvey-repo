import java.util.Scanner;

public class Restaurant {
    private static final String[] menuItems = {"C1", "C2", "C3", "R1", "R2"};
    private static final double[] menuPrices = {100.00, 150.00, 200.00, 35.00, 50.00};
    private static final double[] priceDollar = {1.7618562, 2.6427843, 3.5237859, 0.61666253, 0.88094648};
    private static double total = 0;
    private static double convert = 0;
    private static int quan1 = 0, quan2 = 0, quan3 = 0, quan4 = 0, quan5 = 0;

    public static void main(String[] args) { // main method
        Scanner input = new Scanner(System.in);

        int idx;
        String choice;
        Restaurant restaurant = new Restaurant(); // Restaurant object
        do {
            menu();
            System.out.print("\nEnter the index that you want to order: ");
            idx = input.nextInt();
            input.nextLine();
            
            restaurant.calculate(idx);
            restaurant.orders(idx);
            restaurant.convert(idx);

            do {
                System.out.println("\nDo you want to add more order? (y/n)");
                System.out.print("Answer: ");
                choice = input.nextLine();
                
                if (!choice.equals ("y") && !choice.equals("n"))
                    System.out.println("Invalid Input. Please Select Only (y/n)");
            } while (!choice.equals ("y") && !choice.equals("n"));
        } while (choice.equals("y"));

        printTotal();

        input.close(); // closes the Scanner
    }

    public static void menu() { // prints the menu void method
        System.out.println("\n=======MENU======="); 
        for (int i = 0; i < 3; i++) {
            System.out.println("[" + (i + 1) + "] " + menuItems[i] + " - Php " + menuPrices[i]);
        }
        System.out.println("\n======ADD ONS======");
        for (int k = 3; k < menuItems.length; k++) {
            System.out.println("[" + (k + 1) + "] " + menuItems[k] + " - Php " + menuPrices[k]);
        }
    }

    public void calculate(int idx) { // calculate() void method
        if (idx >= 1 && idx <= menuItems.length) {
            total += menuPrices[idx - 1];
        }
    }

    public static double getTotal() { // double method to use Php total variable
        return total;
    }

    public static void printTotal() { // prints the total
        System.out.println("\n======ORDER HISTORY======");

        if (quan1 > 0)
            System.out.println("C1" + " [" + quan1 + "]");
        if (quan2 > 0)
            System.out.println("C2" + " [" + quan2 + "]");
        if (quan3 > 0)
            System.out.println("C3" + " [" + quan3 + "]");
        if (quan4 > 0)
            System.out.println("R1" + " [" + quan4 + "]");
        if (quan5 > 0)
            System.out.println("R2" + " [" + quan5 + "]");
        System.out.println("\nTotal cost: Php P" + getTotal());
        System.out.println("Total cost: Dollar $" + convertTotal());
    }

    public void convert(int idx) { // Converts into USD method
        if (idx >= 1 && idx <= menuItems.length) {
            convert += priceDollar[idx - 1];
        }
    }

    public static double convertTotal() { // double method to use convert total variable
        return convert;
    }

    public void orders(int idx) { // order() method
        int quan = 1;
        switch (idx) {
            case 1:
                quan1 += quan;
                break;
            case 2:
                quan2 += quan;
                break;
            case 3:
                quan3 += quan;
                break;
            case 4:
                quan4 += quan;
                break;
            case 5:
                quan5 += quan;
                break;
        }
    }
}