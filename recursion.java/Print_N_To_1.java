public class Print_N_To_1 {
    public static void main(String[] args) {
        int n=50;
        int i=1;
        N_To_1(n, i);
        
    }
    public static void N_To_1(int n,int i){
        if(i>n){
            return;
        }
        else{
            System.out.println(n);
            N_To_1(n-1,i);
        }

    }
    }
    

