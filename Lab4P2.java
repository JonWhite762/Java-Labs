import java.util.Scanner;


public class Lab4P2{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int z = 0;
		System.out.println("Input first integer.");
		int x = s.nextInt();
		System.out.println("Input second integer.");
		int y = s.nextInt();
		if (y > x){
			z = y;
			y = x;
			x = z;
		}
		
		int t = lcm(x,y);
		System.out.println("The lcm of these integers is: " + t);
		
			
	}



	public static int gcd(int x, int y){
		if (y == 0){
			return x;
		} else {
			return gcd(y,x%y);
		}
  }
	
	
	public static int lcm(int x, int y){
		int gcd = gcd(x,y);
		int lcm = (x * y)/gcd;
		return lcm;
		
		
	}


}