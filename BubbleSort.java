public class BubbleSort{
      public static void bubbleSort(int nums[]){

          for (int i = 0; i < n - 1; i++) {
             for (int j = 0; j < n - i - 1; j++) {
                  if (arr[j] > arr[j + 1]) {
                     int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                 }
             }
          }
       }
    public static void main (String [] args){
      int nums[] = {8,1,7,2,4,1};
      bubbleSort(nums);
   }
} 