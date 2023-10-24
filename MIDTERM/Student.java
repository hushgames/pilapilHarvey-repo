import java.util.Scanner;

public class Student {
   public String first_name;
   public String middle_name;
   public String last_name;
   public String suffix;
   
   public Student(String first_name, String middle_name, String last_name, String suffix) {
      this.first_name = first_name;
      this.middle_name = middle_name;
      this.last_name = last_name;
      this.suffix = suffix;
   }
   
   public String getFirstName() {
      return first_name;
   }
   
   public String getMiddleName() {
      return middle_name;   
   }
   
   public String getLastName() {
      return last_name;
   }
   
   public String getSuffix() {
      return suffix;
   }
   
   public String getFullName() {
       return first_name + " " + middle_name +" "+ last_name + " "+ suffix;
   }
   
}

class Interface {
   public static String first_name;
   public static String middle_name;
   public static String last_name;
   public static String suffix;
   
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.print("First Name: ");
      first_name = input.nextLine();
      System.out.print("Middle Name: ");
      middle_name = input.nextLine();
      System.out.print("Last Name: ");
      last_name = input.nextLine();
      System.out.print("Suffix: ");
      suffix = input.nextLine();
      
      Student s = new Student(first_name, middle_name, last_name, suffix);
      
      System.out.println("\nFirst Name: " + s.getFirstName());
      System.out.println("Middle Name: " + s.getMiddleName());
      System.out.println("Last Name: " + s.getLastName());
      System.out.println("Suffix: " + s.getSuffix());
      System.out.println("Full Name: " + s.getFullName());
      
   }
}