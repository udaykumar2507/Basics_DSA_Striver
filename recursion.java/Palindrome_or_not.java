public class Palindrome_or_not {
    public static void main(String[] args) {
        String s="levep";
        String s1="";
        char [] Arr=s.toCharArray();  
        reverse(Arr,0,Arr.length-1);
        for (int i=0;i<Arr.length;i++){
            s1+=Arr[i];
        }
        if (s1.equals(s)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    public static void swap(char[]arr,int start,int end){
        char temp=arr[start];
         arr[start]=arr[end];
         arr[end]=temp;
    }
    public static void reverse(char[] arr,int start,int end){
        if (start>=end){
            return ;
        }
        swap(arr,start,end);
        reverse(arr,start+1,end-1);
    }

    
}
