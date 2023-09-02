public class reverse {
    public static void main(String[] args) {
        int n=3456;
        int rev = 0;
        while(n!=0){
            int last_num=n%10;
            rev=(rev*10)+(last_num);
            n=n/10;
        }
        System.out.println(rev);
}
}
