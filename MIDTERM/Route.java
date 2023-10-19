import java.util.Scanner;

public class Route {
    static double distance, r1, r2, r3, r41, r411, r412, end, toa;
    static double r42, r421, r422, r5, r51, r52, end1, end2;
    static double speed = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== Current Location =====");
        System.out.println("Cebu City\nLandmark: South Bus Terminal");
        System.out.print("Enter Speed (km/hr): ");
        speed = input.nextDouble();
        input.nextLine();

        Route r = new Route();

        r.r1();
        System.out.println("\nRoute 1: Cebu City to Minglanilia");
        r.printArrival();

        r.r2();
        System.out.println("\nRoute 2: Minglanilia to San Fernando");
        r.printArrival();

        r.r3();
        System.out.println("\nRoute 3: San Fernando to Carcar");
        r.printArrival();

        System.out.println("\nRoute 4.1 || Route 4.2");
        int obs;

        System.out.print("Is Route 4.1 Obstructed? \n(1: yes / 2: no): ");
        obs = input.nextInt();
        boolean obstructed = false;

        if (obs == 1)
            obstructed = true;

        if (obstructed) {
            System.out.println("\nProceed to Route 4.2");
            r.r42();
            System.out.println("\nRoute 4.2: Cebu City to Sibonga");
            r.printArrival();

            System.out.println("\nRoute 4.2.1 || Route 5");
            System.out.print("Is Route 4.2.1 Obstructed? (1: yes / 2: no): ");
            obs = input.nextInt();
            obstructed = false;
            if (obs == 1)
                obstructed = true;

            if (obstructed) {
                System.out.println("\nProceed to Route 5");
                r.r5();
                System.out.println("\nRoute 5: Cebu City to Argao");
                r.printArrival();

                r.r51();
                System.out.println("\nRoute 5.1: Cebu City to Ronda");
                r.printArrival();

                r.r52();
                System.out.println("\nRoute 5.2: Cebu City to Alcantara");
                r.printArrival();

                r.end2();
                System.out.println("\nDestination 2: Cebu City to Moalboal");
                r.printArrival();
            } else {
                System.out.println("\nProceed to Route 4.2.1");
                r.r421();
                System.out.println("\nRoute 4.2.1: Cebu City to Dumanjug");
                r.printArrival();

                r.r422();
                System.out.println("\nRoute 4.2.2: Cebu City to Alcantara");
                r.printArrival();

                r.end1();
                System.out.println("\nDestination 1: Cebu City to Moalboal");
                r.printArrival();
            }
        } else {
            System.out.println("\nProceed to Route 4.1");
            r.r41();
            System.out.println("\nRoute 4.1: Cebu City to Barili");
            r.printArrival();

            r.r411();
            System.out.println("\nRoute 4.1.1: Cebu City to Dumanjug");
            r.printArrival();

            r.r412();
            System.out.println("\nRoute 4.1.2: Cebu City to Alcantara");
            r.printArrival();

            r.end();
            System.out.println("\nDestination: Cebu City to Moalboal");
            r.printArrival();
        }

        input.close();
    }

    public void printArrival() {
        toa = distance / speed;
        int hours = (int) toa;
        double minutes = (toa - hours) * 60;

        System.out.printf("Estimated Time of Arrival: %dhr %.0fmins\n", hours, minutes);
        System.out.printf("Total Distance: %.1fkm\n", distance);
        System.out.println("Total Speed: "+ (int) speed);
    }

    public void r1() { // Minglanilia 
        r1 = 14.2; // km
        distance = r1;
    }

    public void r2() { // San Fernando
        r2 = 37.3; // km
        distance = r2;
    }

    public void r3() {// Carcar
        r3 = 38.3; // km
        distance = r3;
    }

    public void r41() { // Barili
        r41 = 54.6; // km
        distance = r41;
    }

    public void r411() { // Dumanjug
        r411 = 77.6; // km
        distance = r411;
    }

    public void r412() { // Alcantara
        r412 = 81.2; // km
        distance = r412;
    }

    public void end() {
        end = 84.9; // Moalboal
        distance = end;
    }

    public void r42() { // Sibonga
        r42 = 49.2; // km
        distance = r42;
    }

    public void r421() { // Dumanjug
        r421 = 77.6; // km
        distance = r421;
    }

    public void r422() { // Alcantara
        r422 = 81.2; // km
        distance = r422;
    }

    public void end1() {
        end1 = 84.9; // Moalboal
        distance = end1;
    }

    public void r5() { // Argao
        r5 = 69.7; // km
        distance = r5;
    }

    public void r51() { // Ronda
        r51 = 80.4; // km
        distance = r51;
    }

    public void r52() { // Alcantara
        r52 = 81.2; // km
        distance = r52;
    }

    public void end2() {
        end2 = 84.9; // Moalboal
        distance = end2;
    }
}