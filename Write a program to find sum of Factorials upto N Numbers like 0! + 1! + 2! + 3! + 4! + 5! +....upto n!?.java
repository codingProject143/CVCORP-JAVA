import java.util.Scanner;
class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        int sum = 1;
        int b = 1;
        if(n<0)
        {
            System.out.print("INvalid INput");
        }
        else
        {
            System.out.print(b);
            for(int i=1;i<=n;i++)
            {
                fact = fact*i;
                sum = sum+fact;
                System.out.print("+"+fact);
            }
            System.out.print("="+sum);
        }
    }
}
Testcases O
