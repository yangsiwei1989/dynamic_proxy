package dead_lock;

public class SortBublle {
    public static void main(String[] args) {
        int[] arr = {15,12,9,1,36,23,22,14,9,8,19,7,2,25};
        reorder(arr);
    }

    public static void reorder(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++ ){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =  temp;
                }
            }

        }

        int sum = 0;
        for(int i=0; i<arr.length;i++){
           System.out.println(arr[i]);
           sum += arr[i];
       }
        System.out.println(sum);

    }


}


