import java.util.Scanner;
class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int c=0;
        int h=0;
        int k=0;
        if(n1<0 || n2<0)
        {
           System.out.print("InvAlid InPUts"); 
        }
        else
        {
            for(int i=n1;i<=n2;i++)
            {
                int rev =0;
                int dup = i;
                while(dup>0)
                {
                    int r = dup%10;
                    dup=dup/10;
                    rev=rev*10+r;
                }
                if(rev==i)
                {
                    c++;
                    if(c%2==1)
                    {
                        k++;
                        if(k!=1)
                        {
                            System.out.print(", ");
                        }
                        System.out.print(rev);
                        h++;
                    }
                }
            }
            if(h==0)
            {
                System.out.print("No Palindrome Values");
            }
            else
            {
                System.out.print(".");
            }
        }  
    }
}
