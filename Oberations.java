import java.util.Scanner;
public class Oberations
{
    public static void main(String[] args)
    {
        int first,second,sum,sub,product,remainder;
        float quotient;
        Scanner sc=new Scanner(System.in);
        first=Integer.parseInt (args[0]);
        second=Integer.parseInt (args[1]);
        sum=first + second;
        sub=first - second;
        product=first * second;
        quotient=(float)first / second;
        remainder =first % second;
        System.out.println("Sum:"+sum);
        System.out.println("Difference:"+sub);
        System.out.println("product:"+product);
        System.out.println("Quotient:"+quotient);
        System.out.println("Remainder:"+remainder);
    }
}