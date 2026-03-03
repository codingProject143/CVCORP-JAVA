import java.util.Scanner;
class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c=0;
        int a[]= new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        if(k<=0)
        {
            System.out.print("InvaLid Key VaLue!");
        }
        else
        {
            for(int i=0;i<n;i++)
            {
                for(int j=i+1;j<n;j++)
                {
                    if(a[i]+a[j]==k)
                    {
                        System.out.println(a[i]+" "+a[j]);
                        c++;
                    }
                }
            }
            if(c==0)
            {
                System.out.print("Pairs are not available");
            }
        }
    }
}
