 import java.util.Scanner;
 class triangle
 {
   public static void main (String args[])
   {
    //read input values;
    Scanner sc=new Scanner(System.in);
    int a,b,c;
    double p,area;
    System.out.print("Enter Three sides: ");
    a = sc.nextInt();
    b = sc.nextInt();
    c= sc.nextInt();
    if((a<b+c) && (b<a+c) && (c<a+b))
   {
    if((a==b) && (b==c)) 
    System.out.println("Equilateral triangles");
    else if((a == b) || (b == c) || (c == a))
     System.out.println("Isosceless triangles");
     else
      System.out.println("scanele triangles");
      p = (a+b+c)/2;
      area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
      System.out.println("Area of triangle is="+area);
   }
   else {
     System.out.println("Cannot form a triangle");
   }
   }
 }
 