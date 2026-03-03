import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int sum=0;
	    int count =0;
	    if(n<5)
	    {
	        System.out.print("InValid Array Size.");
	    }
	    else
	    {
    	    int arr[] = new int[n];
    	    for(int i=0;i<n;i++)
    	    {
    	        arr[i]= sc.nextInt();
    	    }
    	    
    	    for(int i=0;i<n;i++)
    	    {
    	        if(arr[i]%2==1)
    	        {
    	            sum =sum+arr[i];
    	            count++;
    	        }
    	    }
    	    if(count!=0)
    	    {
    	        System.out.print(sum);
    	    }
    	    else
    	    {
    	        System.out.print("No Odd Numbers.");
    	    }
	    }
	}
}
