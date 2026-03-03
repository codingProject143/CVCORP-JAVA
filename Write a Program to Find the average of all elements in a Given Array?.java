import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int n =sc.nextInt();
	    
	    int sum = 0;
	    
	    if(n<=0)
	    {
	        System.out.print("Invalid ArRay Size.");
	    }
	    else
	    {
	        int a[] = new int[n];
    	    for(int i=0;i<n;i++)
    	    {
    	        a[i]=sc.nextInt();
    	    }
    	    for(int i=0;i<n;i++)
    	    {
    	       sum=sum+a[i];
    	       
    	    }
    	    System.out.print("Average of Given Array Elements is ");
    	    double avg =(double) sum/n;
    	    System.out.printf("%.5f",avg);
    	    System.out.print(".");
	    }
	}
}
