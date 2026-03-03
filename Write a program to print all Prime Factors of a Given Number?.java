import java.util.Scanner;
class Main{
    public static void main(String []args){
    Scanner Sc = new Scanner(System.in);
    int fc = 0;
    int c = 0;
    int a = Sc.nextInt();
    
    if(a==0)
    {
        System.out.print(" Invalid Input");
    }
    else
    {
        if(a<0)
        {
          a=-(a);
        }
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                fc=0;
                for(int j=1;j<=i;j++)
                {
                    if(i%j==0)
                    {
                        fc++;
                    }
                    
                }
                if(fc==2)
                {
                    System.out.print(i+" ");
                    c++;
                }
                
               
            }
           
        }
        if(c==0)
            {
                System.out.print( "No Prime Factors");
            }
    }
    }
}
