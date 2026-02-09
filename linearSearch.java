public class LinearSearch{
       public static int linearSear(int nums[],int key){
              for(int i=0;i<nums.length;i++){
                  if(nums[i] == key){
                     return true;
                  } else {
                    continue;
                    }
               }
       return false;
       }
       public static void main(String [] args){
       int nums[] = {2,5,1,2,7,10};
       int key = 3;
       linearSear(nums,key);
       }
}