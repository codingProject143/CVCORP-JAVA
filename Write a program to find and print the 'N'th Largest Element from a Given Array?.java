import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=0)
        {
            System.out.print("Invalid Array size.");
            return;
        }
        int a[]= new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        
        int nth = sc.nextInt();
        if(nth<=0 || nth>n)
        {
            System.out.print("Invalid nth value.");
            return;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            
        }
        System.out.print(a[n-nth]);
    }
    
}
