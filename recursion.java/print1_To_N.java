

public class print1_To_N {
    public static void main(String[] args) {
        one_N(10,1);
    }
    public static void one_N(int n,int i){
        if (i>n){
            return;
        }
        else{
            System.out.println(i);
            one_N(n,i+1);
        }
    }
}
    
