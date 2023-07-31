package test;

import java.util.*;
public class totsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }    
        Arrays.sort(arr);
        int tot=0,sum=0,temp=0;
        for(int i=0;i<n;i++)
        {
            tot+=arr[i];
            sum=0;
            for(int j=i+1;j<n;j++)
            {
                sum+=arr[j];
            }
            if (tot==sum) 
            {
                System.out.println("True");
                temp++;
                break;
            }
        }
        if(temp==0)
        {
        	System.out.println("False");
        }
	}

}
