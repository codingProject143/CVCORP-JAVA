import java.util.Scanner;
class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int c=0;
        int sum=0;
        
        if(n1==0 || n2==0)
        {
            System.out.print("INVALID Inputs");
        }
        else
        {
            if(n1<0)
            {
                n1=-(n1);
            }
            if(n2<0)
            {
                n2=-(n2);
            }
     
            if(n1>n2)
            {
                System.out.print("Given Inputs are Swapped");
            }
            else
            {
                for(int i=n1;i<=n2;i++)
                {
                    int dup=i;
                    int rev=0;
                    while(dup>0)
                    {
                        int r=dup%10;
                        dup=dup/10;
                        rev=rev*10+r;
                    }
                    if(rev==i)
                    {
                        sum=sum+i;
                        c++;
                    }
                    // System.out.print(sum);
                }
                float avg =(float)sum/c;
                
                if(c==0){
                    System.out.print("No Palindrome Values");
                }
                else
                {
                    System.out.printf("%.2f",avg);
                }
            }
        }
    }
}
