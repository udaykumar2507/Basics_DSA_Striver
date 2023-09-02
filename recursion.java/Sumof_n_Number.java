public class Sumof_n_Number {
    public static void main(String[] args) {
        System.out.println(print(5));
        
    }
    public static int print (int num){
        if (num==0){
            return 0;
        }
        return num+print(num-1);
    }
    
}//by recursive method