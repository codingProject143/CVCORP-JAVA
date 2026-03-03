import java.util.Scanner;
class main{
    public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
        int n =Sc.nextInt();
        int s = 9;
        if(n<=0)
        {
            System.out.print("Invalid Input.");
        }
        else
        {
        while(n>0)
        {
            int r = n%10;
            n=n/10;
            if(r<s)
            {
                s=r;
            }
        }
        System.out.print("Smallest Digit in a Given Number is "+s+".");
        }
    }
}
