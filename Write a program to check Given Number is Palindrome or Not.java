import java.util.Scanner;
class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int rev = 0;
        if(n1<=0)
        {
            System.out.print("InvAlid Input");
        }
        else
        {
            int dup=n1;
            while(dup>0)
            {
                int r = dup%10;
                dup=dup/10;
                rev=rev*10+r;
            }
            if(n1==rev)
            {
                System.out.print("Palindrome");
            }
            else
            {
                System.out.print("Not a Palindrome");
            }
        }
    }
}
