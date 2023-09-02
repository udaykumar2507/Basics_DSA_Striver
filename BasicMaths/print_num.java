public class print_num{
    public static void main(String[] args) {
        int n=3456;
        while(n!=0){
            System.out.println(n%10);
            n=n/10;
        }
    }

}