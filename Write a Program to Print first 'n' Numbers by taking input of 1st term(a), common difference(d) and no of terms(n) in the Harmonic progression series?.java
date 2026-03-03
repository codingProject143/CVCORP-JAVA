import java.util.Scanner;
class Main{
    public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int d = sc.nextInt();
       int n = sc.nextInt();
       int c = 0;
       if(n<=0)
       {
           System.out.print("Invalid Input");
       }
       else
       {
           for(int i =0;i<n;i++)
           {
               c++;
               if(c!=1)
               {
                   System.out.print(", ");
               }
               float val = (float)1/(a+i*d);
               System.out.printf("%.2f",val);
           }
       }
    }
}
