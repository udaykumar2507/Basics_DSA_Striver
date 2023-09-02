public class sum_of_n_num {
    public static void main(String[] args) {
        sum(5,0);
    }
    public static void sum(int num,int sum){
        if(num<1){
            System.out.println(sum);
            return;
        }
        sum(num-1,sum+num);
    }
    }//sum by normal recursion
