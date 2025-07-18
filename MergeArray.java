public class Merge Arrays 
{

 public static int[]

merge Arrays (int [] arr1, int []arr2)
{

int[] merged Array = new int [arr1.length + arr2.length];

for (int i=0; i < arr1.length; i++) { 
     merged Array[i] = arr 1 [i];
}
for(inti=0;i<arr2.length;i++){
    merged Array[arr1.length+i]=arr2[i];
}
return merged Array;
}
public static void main (striing[]args){
    int[]array1={1,2,3};
    int[]array2={4,5,6};
    int mergedArray=mergeArray(array1,array2);
    System.out.println("merged Array:");
    for(int i-0;i<mergedArray.length;i++){
        System.out.println(merged Array[i]+"");
    
}
}
}