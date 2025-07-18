import java.util.Scanner;
import java.util.Arrays;
public class MergeArrays
{
    public static int[] mergeArrays(int[] array1,int[] array2)
    {
        int[] mergedArray=new int[array1.length+array2.length];

        System.arraycopy(array1,0,mergedArray,0,array1.length);
        System.arraycopy(array2,0,mergedArray,array1.length,array2.length);
        return mergedArray;
    }
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter size of array1:");
        int size1=scanner.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Enter elements:");
        for(int i=0;i<size1; i++)
        {
            array1[i]=scanner.nextInt();

        }
        System.out.println("Enter size of array2:");
        int size2=scanner.nextInt();
        int[] array2=new int[size2];
        System.out.println("Enter elements:");
        for(int i=0;i<size2;i++)
        {
         array2[i]=scanner.nextInt();   
        }
        int[] mergedArray=mergeArrays(array1,array2);
        System.out.println("Merged Array:"+Arrays.toString(mergedArray));

    }
}