import java.util.Scanner;
class main{
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        float val = 0;
        if(n<=0)
        {
            System.out.print("InvaliD InPut");
        }
        else
        {
            for(int i=0;i<n;i++)
            {
                 val=(float)1/(a+(n-1)*d);
            }
            System.out.printf("%.2f",val);
        }
    }
}
