import java.util.Scanner;
class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=1)
        {
            System.out.print("Invalid array size.");
        }
        else
        {
            int a[] = new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            
            int max = Integer.MIN_VALUE;
            int max2 = Integer.MIN_VALUE;
            
            for(int i=0;i<n;i++)
            {
                if(a[i]>max)
                {
                    max2 = max;
                    max= a[i];
                }
                else if(a[i]>max2 && a[i]<max)
                {
                    max2=a[i];
                }
            }
            System.out.print(max2);
        }
    }
}
