import java.util.Scanner;
class main{
    public static void main(String [] args){
        Scanner Sc=new Scanner (System.in);
        int n = Sc.nextInt();
        int arm=0;
        int dup=n;
        int c=0;
        if(n<1)
        {
            System.out.print("Invalid Input");
        }
        else
        {
            while(dup>0)
            {
                dup=dup/10;
                c++;
            }
            dup=n;
            while(dup>0)
            {
                int r=dup%10;
                arm=arm+(int)Math.pow(r,c);
                dup=dup/10;
            }
            if(arm==n)
            {
                System.out.print("Armstrong Number");
            }
            else
            {
                System.out.print("Not a Armstrong Number");
            }
        }
    }
}
