import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=0)
        {
            System.out.print("Invalid Array Size.");
            return;
        }
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int key = sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]<key)
            {
                count++;
            }
        }
        if(count==0)
        {
            System.out.print("No such numbers below given Key Value.");
        }
        else
        {
            System.out.print(count);
        }
    }
}
