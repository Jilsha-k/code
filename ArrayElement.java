import java.util.Scanner;
public class ArrayElement {
    public static void main (String[] args) {
         Scanner sc = new Scanner(System.in);
         int i,j,temp;
         int n=10;
         int[] arr=new int[n];
         System.out.println("Enter Ten elements:");
         for(i=0;i < n;i++) {
            arr[i] = sc.nextInt();

        }
        for(i=0;i<n;i++) {
            for(j=i+1;j<10;j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                
            }
        }
    
         System.out.println("Smallest =" + arr[0]);
         System.out.println("Largest =" + arr[n-1]);
         System.out.println("Second largest =" + arr[n-2]);
         
}
}