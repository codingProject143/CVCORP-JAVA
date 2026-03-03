import java.util.Scanner;
class main{
    public static void main(String[] args){
    Scanner Sc = new Scanner(System.in);
    int n= Sc.nextInt();
    int c=0;
    if(n==0)
    {
        System.out.print("InvaliD Input");
    }
    else if(n<0)
    {
        n=-n;
        while (n>0)
        {
            n=n/10;
            c++;
        }
        
        if(c==1)
        {
            System.out.print("Given Number consists of only "+c+" Digit and it is Negative Value.");
        }
        else
        {
            System.out.print("Given Number consists of "+c+" Digits and it is Negative Value.");
        }
    }
    else
    {
        while(n>0)
        {
           int r=n%10;
           n=n/10;
           c++;
        }
        if(c==1)
        {
            System.out.print("Given Number consists of only "+c+ " Digit.");
        }
        else
        {
            System.out.print("Given Number consists of "+c+ " Digits.");
        }
    }
        
        
    }
}
