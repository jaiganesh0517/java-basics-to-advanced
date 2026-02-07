/*In this section we will learn about methods(similar to functions) in java 
 function are basically a way that creates a easy way to doing Task.
 and it also contribute to the cleanliness of the code*/

/*Syntax 
 accessModifier returnType methodName(perimeter){} and at the end of the function inside the back parenthesis we write return statement
 We always write method  in between the class and main method this the 
 standard way of writing methods. 
 we call the main from inside the main method */


//Sum method for addition of two numbers 
class Methods{
   public static int sum(int a,int b){// method 
      return a + b; 
   }
   //Multiplication table 
   public static void multTable(int n ){
        int i = 1;
    while(i <= 10){
        System.out.println( n + " * "+i+" = "+ n*i);
        i++;
      }
   }
   public static void main(String [] args){
      int a = 2;
      int b = 4;
      System.out.println(sum(a,b)); //method call
      System.out.println(multTable(a);
   } 
} 
