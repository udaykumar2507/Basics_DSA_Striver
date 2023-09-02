public class reverse_an_array{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,8,9,0,7,8,6,9,9,9,9};
        reverse(arr,0,arr.length-1);
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
   
    public static void reverse(int []arr,int a,int b){
        if (a>=b){
            return;
        }
        swap(arr,a,b);
        reverse(arr,a+1,b-1);
    } 
    } 
