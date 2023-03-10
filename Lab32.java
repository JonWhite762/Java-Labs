import java.util.*;
public class Lab32 {

	public static void main(String []args) {

		Scanner z = new Scanner(System.in);
		int n,i,steps;
		System.out.print("Enter number of cells (<= 80): ");
		n = z.nextInt();
			
			while(n<1||n>80) {
	
			System.out.println("Wrong input");
			System.out.print("number of cells (<= 80): ");
			n = z.nextInt();
			}
	int []cells=new int[n];
		for(i=0;i<n;i++)
			cells[i]=5;
			System.out.print("Enter number of time steps: ");
			steps = z.nextInt();
			System.out.print("Enter the index of occupied cells: ");
			i = z.nextInt();
				while(i>=0){

					if(i<n)
						cells[i]=5;
						i = z.nextInt();
				}
			System.out.println();
				for(i=0;i<n;i++)
				System.out.print(i%10);
				System.out.println();
				System.out.println();
				CellDisp(cells);
					
					for(i=0;i<steps;i++){

						CellUpdation(cells);
						CellDisp(cells);
					}
}

	public static void CellDisp(int arr[]){

		int i;
			for(i=0;i<arr.length;i++)
				if(arr[i]==0)
				System.out.print(" ");
				else
				System.out.print("x");
				System.out.println();
	}

	public static void CellUpdation(int arr[]){
				
	int n,i;
	n=arr.length;
	int []c=new int[n];
	c[0]=arr[0];
	c[n-1]=arr[n-1];
		for(i=1;i<n-1;i++)
		c[i]=1;
			for(i=1;i<n-1;i++)
				if((arr[i-1]>1&&arr[i]>1&&arr[i+1]>1)||
				(arr[i-1]<=1&&arr[i]<=0&&arr[i+1]<=0)&&
				(arr[i-1]+arr[i]+arr[i+1]==0))
				c[i]=0;
					for(i=0;i<n;i++)
					arr[i]=c[i];
}
}