import java.util.HashMap;
import java.util.Scanner;

public class hashing3 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> hashmap=new HashMap<>();
        for (int i=0;i<n;i++){
            if (hashmap.containsKey(arr[i])){
                hashmap.put(arr[i],hashmap.get(arr[i])+1);
            }else{
                hashmap.put(arr[i],1);
            }
        }
        for (int i=0;i<5;i++){
            System.out.print("Enter the num");
            int n1=sc.nextInt();
            System.out.println("Output"+hashmap.getOrDefault(n1,0));
        }



    }
}
