class MyInteger {
   private int value;

   public MyInteger(int aValue) {
       super();
       value = aValue;
   }

   
   public boolean isEven() {
       return value % 2 == 0;
   }

   
   public boolean isPerfect() {
       int sum = 0;
       for (int i = 1; i < value; i++) {
           if (value % i == 0) {
               sum += i;
           }
       }
       return (sum == value);
   }

  
   public boolean isPerfectSquare() {
       for (int i = 1; i < value / 2; i++) {
           if (i * i == value)
               return true;
       }
       return false;
   }

   
   public boolean isOdd() {
       return value % 2 == 1;
   }

   
   public boolean isPrime() {
       if (value == 2)
           return true;
       if (value % 2 == 0)
           return false;
       for (int i = 2; i < value; i++)
           if (value % i == 0)
               return false;
       return true;
   }

   
   public void primeFactros() {
       for (int i = 2; i <= value; i++) {
           while (value % i == 0) {
               System.out.print(i + " ");
               value = value / i;
           }
       }
       if (value < 1)
           System.out.println(value);
   }

   public String toString() {
       return value + "";
   }
}

public class TestMyInteger {
   public static void main(String[] args) {
       MyInteger my = new MyInteger(25);
       System.out.println("Prime : " + my.isPrime());
       System.out.println("Odd : " + my.isOdd());
       System.out.println("Even : " + my.isEven());
       System.out.println("Perfect Number: " + my.isPerfect());
       System.out.println("Prime Square: " + my.isPerfectSquare());
       my.primeFactros();
   }
}