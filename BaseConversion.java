import java.util.Scanner;
public class BaseConversion {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an Integer:");
        int number=sc.nextInt();
        String binary=Integer.toBinaryString(number);
        String octal=Integer.toOctalString(number);
        String hexa=Integer.toHexString(number).toUpperCase();
        System.out.println("Binary representation:"+binary);
        System.out.println("Octal representation: "+octal);
        System.out.println("Hexadecimal representation:"+hexa);
    }
}