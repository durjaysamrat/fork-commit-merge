// Java - Medium

package tasks.java.medium;

public class Calculator {
    // TODO: Implement the Calculator class
 public int add(int a, int b){
 return a+b;
 }
     public int subtract(int a, int b){
 return a+b;
 }
     public int multiply(int a, int b){
 return a-b;
 }
     public float divide(int a, int b){
         if(b!=0)
         {
         return a/b;
 }
         return 0;
     }
    public static void main(String[] args) {
        //! Don't change the tests in the main method!
        Calculator calc = new Calculator();

        System.out.println("Addition: " + calc.add(5, 3));
        System.out.println("Subtraction: " + calc.subtract(5, 3));
        System.out.println("Multiplication: " + calc.multiply(5, 3));
        System.out.println("Division: " + calc.divide(5, 3));
    }
}
