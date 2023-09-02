public class Prt_name_5Times {
    public static void main(String[] args) {
        String name="Ujval";
        int count=1;
        printname(name,count);
        
    }
    public static void printname(String s,int count){//TIME_cOMPLEXITy=O(1)
        if (count>5){
            return;
        }
        else{
            System.out.println(s);
            printname(s,count+1);
        }
    }
    
}
