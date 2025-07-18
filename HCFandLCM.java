import java.util.Scanner;
public class HCFandLCM
{
    public static void main (String args[])
{
    Scanner scanner=new Scanner(System.in);
    System.out.print("enter num1:");
    int num1=scanner.nextInt();
    System.out.print("enter num2:");
    int num2=scanner.nextInt();
    int hcf=findHCF(num1,num2);
    int lcm=findLCM(num1,num2,hcf);
    System.out.println("num1:"+num1);
    System.out.println("num2:"+num2);
    System.out.println("HCF:"+hcf);
    System.out.println("LCM:"+lcm);
    scanner.close();
}
public static int findHCF(int a,int b)
{
 while(b!=0)
 {
    int temp=b;
    b=a%b;
    a=temp;
 }
 return a;
}
public static int findLCM(int a,int b,int hcf)
{
    return Math.abs(a*b)/hcf;
}
}
