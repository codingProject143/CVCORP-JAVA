import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hex = sc.next();
        int dec = 0;
        int p=0;
        int in=0;
        if(hex.charAt(0)=='-'){
            in=1;
        }
        for(int i=hex.length()-1;i>=in;i--)
        {
            char ch=hex.charAt(i);
            if(ch>='0' && ch<='9')
            {
                dec =dec+(ch-48)*(int)Math.pow(16,p++);
            }
            else if(ch>='A' && ch<='F')
            {
                dec= dec+(ch-55)*(int)Math.pow(16,p++);
            }
            else if(ch>='a' && ch<='f')
            {
                dec = dec+(ch-87)*(int)Math.pow(16,p++);
            }
            else
            {
                p=-1;
                break;
            }
        }
        if(p==-1)
        {
            System.out.print("InvaliD Input");
        }
        else
        {
            String bin = "";
            while(dec>0)
            {
                int r=dec%8;
                dec = dec/8;
                bin = r+bin;
            }
            if(hex.charAt(0)=='-')
            {
                System.out.print(hex+" -> "+bin);
            }
            else
            {
                System.out.print(bin);
            }
        }
    }
}
