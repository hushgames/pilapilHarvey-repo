import java.util.Scanner;

public class Student {
   public int studentId, age, yearLvl, phoneNum;
   public String firstName, middleName, lastName, suffix, email;
   
   public Student(int studentId, String firstName, String middleName, String lastName, String suffix, int age, int yearLvl, int phoneNum, String email) {
      this.studentId = studentId;
      this.firstName = firstName;
      this.middleName = middleName;
      this.lastName = lastName;
      this.suffix = suffix;
      this.age = age;
      this.yearLvl = yearLvl;
      this.phoneNum = phoneNum;
      this.email = email;
      
      Course c = new Course(studentId, firstName, middleName, lastName, suffix, age, yearLvl, phoneNum, email);
   }
   
}

class Course {
   public static int studentId, age, yearLvl, phoneNum;
   public static String firstName, middleName, lastName, suffix, email;
   
   public Course (int studentId, String firstName, String middleName, String lastName, String suffix, int age, int yearLvl, int phoneNum, String email){
      this.studentId = studentId;
      this.firstName = firstName;
      this.middleName = middleName;
      this.lastName = lastName;
      this.suffix = suffix;
      this.age = age;
      this.yearLvl = yearLvl;
      this.phoneNum = phoneNum;
      this.email = email;
   }

   public static void updateProfileDetails(Scanner input){
      System.out.println("\n==================================");
      System.out.println("Student Profile Details:");
      System.out.println("1.   *Student ID Number: " + studentId);
      System.out.println("2.   *First Name: " + firstName);
      System.out.println("3.   *Middle Name: " + middleName);
      System.out.println("4.   *Last Name: " + lastName);
      System.out.println("5.   *Suffix: " + suffix);
      System.out.println("6.   *Age: " + age);
      System.out.println("7.   *Year Level: " + yearLvl);
      System.out.println("8.   *Phone Number: " + phoneNum);
      System.out.println("9.   *Email: " + email);
      System.out.println("==================================");
      System.out.println("What do you want to update");
      System.out.print("Choice: ");
      int choice = input.nextInt();
      
      switch (choice) {
         case 1:
            System.out.print("New Student ID Number: ");
            studentId = input.nextInt();
            break;
         case 2: 
            input.nextLine();
            System.out.print("New First Name: ");
            firstName = input.nextLine();
            break;
         case 3:
            input.nextLine();
            System.out.print("New Middle Name: ");
            middleName = input.nextLine();
            break;
         case 4:
            input.nextLine();
            System.out.print("New Last Name: ");
            lastName = input.nextLine();
            break;
         case 5: 
            input.nextLine();
            System.out.print("New Suffix: ");
            suffix = input.nextLine();
            break;
         case 6: 
            System.out.print("New Age: ");
            age = input.nextInt();
            break;
         case 7:
            System.out.print("New Year Level: ");
            yearLvl = input.nextInt();
            break;
         case 8:
            System.out.print("New Phone Number: ");
            phoneNum = input.nextInt();
            break;
         case 9:
            input.nextLine();
            System.out.print("New Email: ");
            email = input.nextLine();
            break;
         default:
            System.out.println("Invalid Input.");
      }
   }
   
   public static void updateCourseDetails() {
      
   }
   
   public static void displayStudentRecord() {
      System.out.println("\n==================================");
      System.out.println("Student Profile Details:");
      System.out.println("   *Student ID Number: " + studentId);
      System.out.println("   *First Name: " + firstName);
      System.out.println("   *Middle Name: " + middleName);
      System.out.println("   *Last Name: " + lastName);
      System.out.println("   *Suffix: " + suffix);
      System.out.println("   *Age: " + age);
      System.out.println("   *Year Level: " + yearLvl);
      System.out.println("   *Phone Number: " + phoneNum);
      System.out.println("   *Email: " + email);
      System.out.println("==================================");
   }
}

class Interface {
   public static void main (String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("==================================");
      System.out.println("Student Record Management App v1");
      
      System.out.println("Selection Menu:\n--------------------");
      System.out.println("1. Create Student Record\n0. Exit\n--------------------------------");
      System.out.print("\n\nEnter Selection: ");
      int choice = input.nextInt();
      System.out.println("\n\n==================================");
      
      switch (choice) {
         case 0:
            System.exit(0);
            break;
         case 1:
            System.out.println("\n\n==================================");
            System.out.println("Student Record Management App v1");
            
            System.out.println("Student Details: \n--------------------------------");
            System.out.println("Student ID no.\n--------------------------------");
            System.out.print("\n\nStudent ID No.: ");
            int studentId = input.nextInt();
            input.nextLine();
            System.out.print("First Name: ");
            String firstName = input.nextLine();
            System.out.print("Middle Name: ");
            String middleName = input.nextLine();
            System.out.print("Last Name: ");
            String lastName = input.nextLine();
            System.out.print("Suffix: ");
            String suffix = input.nextLine();
            System.out.print("Age: ");
            int age = input.nextInt();
            System.out.print("Year Level: ");
            int yearLvl = input.nextInt();
            System.out.print("Phone Number: ");
            int phoneNum = input.nextInt();
            input.nextLine();
            System.out.print("Email: ");
            String email = input.nextLine();
            
            System.out.println("\n\n==================================");
            Student s = new Student(studentId, firstName, middleName, lastName, suffix, age, yearLvl, phoneNum, email);
            break;
      }
      while (true) {
         System.out.println("1. Update Student Profile Details\n2. Update Student Course Details\n3. Display Student Record\n0. Exit");
         System.out.print("Choice: ");
         choice = input.nextInt();
         
         switch (choice) {
            case 0:
               System.exit(0);
               break;
            case 1:
               Course.updateProfileDetails(input);
               break;
            case 2:
               break;
            case 3:
               Course.displayStudentRecord();
               break;
         }
      }
   }
}
