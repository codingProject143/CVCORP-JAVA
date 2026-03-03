import java.util.Scanner;
class main{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int gcd = 0;
        if(a<=0 && b<=0 && c<=0||a<=0&&b<=0||a<=0&&c<=0||b<=0&&c<=0)
        {
            System.out.print("Invalid Inputs");
        }
        else if(a<=0)
        {
            System.out.print("Invalid First Input");
        }
        else if(b<=0)
        {
            System.out.print("Invalid Second Input");
        }
        else if(c<=0)
        {
            System.out.print("Invalid Third Input");
        }
        else
        {
            for(int i=1; i<=a && i<=b && i<=c; i++)
            {
                if(a%i==0 && b%i==0 && c%i==0)
                {
                    gcd=i;
                   //System.out.print(i)
        
                }
            }
            System.out.print(gcd);
        }
    }
}
