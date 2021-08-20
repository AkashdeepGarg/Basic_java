import java.util.*;

class sales
{
	int i, max, min, x[]=new int[9];
	Scanner n = new Scanner(System.in);
	
	void minMax(int count) 
	{
		System.out.println("\nRepresentative " + count + " sales: ");
		
		for(i = 0; i < x.length - 2; i++)
		{
			System.out.print("Day "+ (i+1) + ": ");
			x[i] = s.nextInt();
			if(i == 0) {
				max = x[i];
				min = x[i];
			}
			if(x[i] > max)
				max = x[i];
			if(x[i] < min)
				min = x[i];
		}
		
		x[7] = max;
		x[8] = min;
	}
	
	void print(int a[], int count1)
	{
		System.out.println("\nSales of Representative " + count1 + ": ");
		
		for(i = 0; i < x.length - 2; i++) {
			System.out.println("Day " + (i + 1) + ": " + x[i]);
		}
		System.out.println("Maximum sale: " + x[7]);
		System.out.println("Minimum sale: " + x[8]);
	}
}

class MinMaxSales {
	public static void main(String args[])
	{
		System.out.println("Enter the details for first week of November: ");
		sales n1 = new sales();
		sales n2 = new sales();
		sales n3 = new sales();
		sales n4 = new sales();
		sales n5 = new sales();
		sales n6 = new sales();
		sales n7 = new sales();
		sales n8 = new sales();
		n1.minMax(1);
		n2.minMax(2);
		n3.minMax(3);
		n4.minMax(4);
		n5.minMax(5);
		n6.minMax(6);
		n7.minMax(7);
		n8.minMax(8);
		System.out.println("\nSales details for first week of November: ");
		n1.print(n1.x, 1);
		n2.print(n2.x, 2);
		n3.print(n3.x, 3);
		n4.print(n4.x, 4);
		n5.print(n5.x, 5);
		n6.print(n6.x, 6);
		n7.print(n7.x, 7);
		n8.print(n8.x, 8);
	}
}