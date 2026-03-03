import java.util.Scanner;
class main{
    public static void main (String[] args){
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int h=0;
        if(n<=0)
        {
            System.out.print("Invalid Input.");
        }
        else
        {
            while(n>0)
            {
                int r = n%10;
                n = n/10;
                if(h<r)
                {
                    h=r;
                }
            }
            System.out.print("Highest Digit in a Given Number is "+h+".");
        }
    }
}
