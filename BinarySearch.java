//Prerequisite Arrays should be sorted
public class BinarySearch{
      public static int binarySear(int nums[],int key){
             int mid ;
             int left = 0;
             int right = nums.length -1;
             while(l < r){
                mid = (left + right )/2;
                if(key == nums[mid]){
                   return mid;
                } else if(nums[mid] > key){
                   right = mid -1;
                 } else{
                   left = mid +1;
                  }
            }
       return -1;
}
      public static void main (String [] args){
        int nums[] = {2,4,5,6,8};
        int key = 4;
        binarySear(nums,key);
     }
}