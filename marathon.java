package test;

import java.util.*;
public class marathon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int goal;
		while(true)
		{
			System.out.println("Enter a starting distance(between 5 km to 8km)");
			goal=sc.nextInt();
			if(goal>=5 && goal<=8)
			{
				break;
			}
			else
			{
				System.out.println("Sorry, Choose between 5km to 8km");
			}
		}
		int i=goal;
		while(i>0)
		{
			System.out.println("Distance to run: "+i);
			if(i==goal-1)
			{
				System.out.println("Good start, keep it up");
			}
			if(i<3)
			{
				System.out.println("Almost there!");
			}
			i--;
		}
		System.out.println("Done for the day!");
	}

}
