import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    if(n<1)
	    {
	        System.out.print("InvALId ArrAy SIze.");
	        System.exit(0);
	    }
	    else
	    {
    		int arr[] = new int[n];
    		
    		for(int i=0;i<n;i++)
    		{
    		    arr[i]=sc.nextInt();
    		}
    		
    		for(int i=0;i<n;i++)
    		{
    		    if(i==0)
    		    {
    		        System.out.print("Given Array Elements - ");
    		    }
    		    System.out.print(arr[i]+" ");
    		}
    		System.out.println();
    		for(int i=n-1;i>=0;i--)
    		{
    		    if(i==n-1)
    		    {
    		        System.out.print("Reverse Array Elements - ");
    		    }
    		    System.out.print(arr[i]+" ");
    		}
	    }
	}
}
