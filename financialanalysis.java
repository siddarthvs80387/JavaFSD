package test;

import java.util.*;
public class financialanalysis {

	public static void main(String[] args) {
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
		for(int j:arr)
		{
			arr1[i++]=j;
		}
		int max=0;
		for(int k=ctr;k>=2;k--)
		{
			for(i=0;i<ctr-k+1;i++) 
			{
				int tot=0;
				for(int j=i;j<i+k;j++)
				{
					tot+=arr1[j];
				}
				if (tot>max)
					max=tot;
			}
		}
		System.out.println(max);
	}

}
