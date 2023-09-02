public class GCD_eucledian_ {
    public static void main(String[] args) {//its complexity is O(min(n1,n2))
        int n1=99;
        int n2=66;
        // int min=Math.min(n1,n2);
        // for (int i=1;i<=min;i++){
        //     if (n1%i==0 && n2%i==0){
        //         gcd=i;
        //     }
        // }
        // System.out.println(gcd);
        //EUCLEDION FORMULA
        while(n1>0 && n2>0){
            if (n1>n2){
                n1=n1%n2;
            }else{
                n2=n2%n1;
            }
                                     // Complexity for Eucledian is O(log(min(n1,n2)))     
        }
        if (n1==0){
            System.out.println("GCD is"+n2);
        }
        else{
            System.out.println("GCD is "+n1);
        }
    }
    
}
