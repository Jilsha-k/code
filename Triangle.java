public class Triangle
{
     public static void main (String[] args)
     {
        double s1=3;
        double s2=3;
        double s3=3;
        if(s1 == s2 && s2 == s3)
        {
            System.out.println("Equilateral triangle");
        }
        else if (s1 == s2 || s1==s3 || s2==s3)
        {
            System.out.println("Isoceless triangle");
        }
        else
        {
            System.out.println("Scalene");
        }
        double area= CalcArea(s1,s2,s3);
        {
            System.out.println("Area="+area);
        }
     }
private static double CalcArea(double s1,double s2,double s3)
{
    double SemiPerimeter=(s1+s2+s3)/2;
    return Math.sqrt(SemiPerimeter*(SemiPerimeter-s1)*(SemiPerimeter-s2)*(SemiPerimeter-s3));
}
}