import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int gcd = 0;
        
        if (n1 <= 0 && n2 <= 0 && n3 <= 0 || n1<=0 && n2<=0 || n2<=0 && n3<=0 || n3<=0 && n1<=0) 
        {
            System.out.print("Sorry Invalid Inputs!");
        } 
        else if (n1 <= 0)
        {
            System.out.print("InvalId First Input");
        } 
        else if (n2 <= 0) 
        {
            System.out.print("Invalid Second Input");
        } 
        else if (n3 <= 0) 
        {
            System.out.print("InvaliD ThirD Input");
        } 
        else
        {
          for(int i =1; true;i++)
          {
              if(i%n1==0 && i%n2==0 && i%n3==0)
              {
                  System.out.print(i);
                  break;
              }
          }
        }
    }
}
