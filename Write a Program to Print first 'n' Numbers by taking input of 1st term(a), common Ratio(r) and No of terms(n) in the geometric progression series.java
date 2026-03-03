import java.util.Scanner;
class Main{
    public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int r = sc.nextInt();
       int n = sc.nextInt();
       int c=0;
       
       if(n<=0)
       {
           System.out.print("Invalid Input.");
       }
       else
       {
           for(int i =0;i<n;i++)
           {
               int b = a*(int)Math.pow(r,i);
               c++;
               if(c!=1)
               {
                   System.out.print(", ");
               }
               System.out.print(b);
           }
           System.out.print(".");
       }
    }
}
