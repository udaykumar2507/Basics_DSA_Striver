public class Factorial{
        public static void main(String[] args) {
            System.out.println(print(3));
            
        }
        public static int print (int num){
            if (num==1){
                return 1;
            }
            return num*print(num-1);
        }
        
    }//by recursive method
    

