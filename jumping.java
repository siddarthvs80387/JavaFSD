package test;

import java.util.*;

public class jumping {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int ctr=0;
		while(sc.hasNextInt())
		{
			arr.add(sc.nextInt());
			ctr++;
		}
		int arr1[] = new int[ctr];
		int i=0;
		//System.out.print("Done");
		for(int j:arr)
		{
			arr1[i++]=j;
		}
		int step=0;
		for(i=0;i<ctr;)
		{
			if(arr1[i]==1)
			{
				step++;
				i+=1;
				continue;
			}
			int max=0;
			for(int j=i+1;j<i+arr1[i];j++)
			{
				if(i+arr1[i]>ctr)
				{
					step++;
					i=ctr;
					break;
				}
				if(arr1[j]>max)
				{
					max=arr1[j];
				}
			}
			//System.out.println(i);
			i+=max;
			step++;
		}
		System.out.println(step-1);
	}

}
