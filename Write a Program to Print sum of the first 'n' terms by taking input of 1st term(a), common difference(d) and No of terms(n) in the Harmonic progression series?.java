import  java.util.Scanner;
class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        float val = 0;
        float sum = 0;
        
        if(n<=0)
        {
            System.out.print("Invalid Input.");
        }
        else
        {
            for(int i=0;i<n;i++)
            {
                val = (float)1/((a+(i*d)));
                sum = sum+val;
            }
            System.out.printf("%.2f",sum);
        }
    }
}
