public class Lab1 { 
	public static void main(String[] args) {
		int[] a = new int[1000];
		init(a);
		findPrimes(a);
		printPrimes(a);
	}
		public static void init(int[] a) {
			for(int i = 2; i < a.length; i++) {
			a[i] = 1;
			} 
		}
			public static void findPrimes(int[] a) {
				for(int i = 4; i < a.length; i++) {
					if(i%2==0) {
						a[i] = 0;
					}
					if(i%3==0) {
						a[i] = 0;
					}
				} 
			}
				public static void printPrimes(int[] a) {
					for(int i = 0; i < a.length; i++) {
						if(a[i]==1) {
						System.out.println(i + " Is a prime number ");
						} 
							if(a[i]==0) {
							System.out.println(i + " Is not a prime number");
							}
					} 
				} 
} 
