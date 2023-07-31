package test;
import java.util.*;
public class namesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String arr[]= new String[n+1];
		for(int i=0;i<n+1;i++)
		{
			arr[i]=sc.nextLine();
		}
		Arrays.sort(arr);
		for(String i:arr)
		{
			System.out.println(i);
		}
	}

}
