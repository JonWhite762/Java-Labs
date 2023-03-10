import java.util.*;
  public class Lab2P3 {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
     System.out.println("Enter Grade: ");
      int x = s.nextInt();
   
    if (x < 0 || x > 100) {
    System.out.println("Invalid grade");
    } else 
      if (x >= 90) { 
        System.out.println("A+");
      } else 
      if (x >= 80) {
        System.out.println("A");
      } else 
      if (x >= 70) {
        System.out.println("B");
      } else
      if (x >= 55) { 
        System.out.println("C");
      } else
      if (x >= 54) {
        System.out.println("D");
      } else 
      System.out.println("F");
    }
  }