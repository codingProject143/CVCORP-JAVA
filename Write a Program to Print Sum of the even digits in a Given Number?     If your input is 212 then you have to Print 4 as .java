import java.util.Scanner;
class main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n1=sc.nextInt();
    int rev =0;
    if(n1<1)
    {
        System.out.print("Invalid Input");
    }
    else
    {
      while(n1>0)
      {
          int r =n1%10;
          n1=n1/10;
          if(r%2==0)
          {
            rev = rev+r;
          }
      }
      System.out.print(rev);
    }
   }
}
