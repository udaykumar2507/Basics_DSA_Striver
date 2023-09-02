public class palindrome {
    public static void main(String[] args) {
        int n=43499;
        int dup=n;
        int rev=0;
        while(n!=0){
            int last_num=n%10;
            rev=(rev*10)+last_num;
            n/=10;
        }
        if (dup==rev){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    
}
}
