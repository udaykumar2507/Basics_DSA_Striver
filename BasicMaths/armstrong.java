public class armstrong {
    public static void main(String[] args) {
        int n=407;
        int dup=n;
        int sum=0;
        while(n!=0){
            sum+=(n%10)*(n%10)*(n%10);
            n/=10;
        }
        System.out.println(sum);
    }
    
}
