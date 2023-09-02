
// public class hashing{
// public static int count(int n,int[]arr){
//     int count=0;
//     for (int i=0;i<arr.length;i++){
//         if (arr[i]==n){
//             count++;
//         }
//     }
//     return count;
// }
// public static void main(String[] args) {
//     int[] arr={1,2,4,5,6,6,6,6};
//     System.out.println(count(6,arr));
// }
// }
//               Hashing an Integer Array    
import java.util.Scanner;

public class hashing1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []array=new int[n];
        for (int i=0;i<n;i++){
            System.out.println("Enter the num in array");
            array[i]=sc.nextInt();
        }
        int hash[]=new int[12];
        for (int i=0;i<n;i++){
            hash[array[i]]+=1;
        }
        int z=sc.nextInt();
        for (int i=0;i<z;i++){
            System.out.println("enter the digit");
            int m=sc.nextInt();
            System.out.println("output : "+hash[m]);
        }
    }
}