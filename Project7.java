import java.util.Scanner;
import java.util.*;

	    public class Project7 {
		public static void main(String []args){
		
		Scanner in=new Scanner(System.in);
		
		int n,i,steps;
		
		System.out.println("Welcome to the cellular automaton simulation!");
		
		System.out.print("Enter number of cells (<= 80): ");
		
		n=in.nextInt();
		
		while(n<1||n>255){
			
			System.out.println("invalid length");
			
			System.out.print("Enter number of cells (<= 80): ");
			
			n=in.nextInt();
		}
		int []cells=new int[n];
		for(i=0;i<n;i++)
		cells[i]=0;
		System.out.print("Enter number of time steps: ");
		steps=in.nextInt();
		System.out.print("Enter the index of occupied cells (negative index to end): ");
		i=in.nextInt();
		while(i>=0){
			if(i<n)
			cells[i]=1;
			i=in.nextInt();
		}
		System.out.println();
		for(i=0;i<n;i++)
		System.out.print(i%10);
		System.out.println();   
		System.out.println();
		displayCells(cells);
		for(i=0;i<steps;i++){
			updateCells(cells);
			displayCells(cells);
		}
	}
	public static void displayCells(int data[]){
		int i;
		for(i=0;i<data.length;i++)
		if(data[i]==0)
		System.out.print("x");
		else
		System.out.print(" ");
		System.out.println();
	}
	public static void updateCells(int a[]){
		int n,i;
		n=a.length;
		int []t=new int[n];
		t[0]=a[0];
		t[n-1]=a[n-1];
		for(i=1;i<n-1;i++)
			t[i]=1;
		for(i=1;i<n-1;i++)
			if((a[i-1]==1&&a[i]==1&&a[i+1]==1)||
			(a[i-1]==1&&a[i]==0&&a[i+1]==0)||
			(a[i-1]+a[i]+a[i+1]==0))
			 t[i]=0;
		for(i=0;i<n;i++)
			a[i]=t[i];

	  }
}