import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Calculator {
   static Queue<Character> operands = new LinkedList<>();
   public static void main(String[] args) {     
      Stack<Character> operators = new Stack<>();
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter an Expression: ");
      String ex = input.nextLine();
      
      char calc;
      String opTable = "*/+-";
      for (int i = 0; i < ex.length();i++) {
         calc = ex.charAt(i);
         if (Character.isDigit(calc))
            operands.add(calc);
         else if (opTable.contains(Character.toString(calc)))
            operators.push(calc);
      }
      System.out.println("Operands: " + operands + "\nOperators: " + operators);
   }
}