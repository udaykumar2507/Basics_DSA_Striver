
// import java.util.Scanner;

// public class hashing2 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String s=sc.nextLine();
//         int hashh[]=new int[26];
//         for (int i=0;i<s.length();i++){
//             hashh[ s.charAt(i)-'a']+=1;
//         }
//         for (int i=0;i<5;i++){
//             System.out.print("Enter the alph:");
//             char c=sc.next().charAt(0);
//             System.out.println(hashh[c-'a']);
//         }


//     }
    
// }
import java.util.Scanner;

public class hashing2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int hashh[]=new int[256];//this is because there are total 256 ascii charcaters
        for (int i=0;i<s.length();i++){
            hashh[ s.charAt(i)]+=1;
        }
        for (int i=0;i<5;i++){
            System.out.print("Enter the alph:");
            char c=sc.next().charAt(0);
            System.out.println(hashh[c]);
        }


    }
    
}



