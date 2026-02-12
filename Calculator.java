public class Calculator{
      public static void main (String [] args){
      Scanner sc = new Scanner(System.in);
      int a = 5;
      int b = 3;
      int n = sc.nextInt();//1=add,2=sub,3=product,4=division and 5=  modulus 
      switch(n){
      Case 1:
      System.out.println("addition = "+ (a+b));
      break;
      Case 2:
      System.out.println("subtraction = "+ (a-b));
      break;
      Case 3:
      System.out.println("product = "+ (a*b));
      break;
      Case 4:
      System.out.println("division = "+ (a/b));
      break;
      Case 5:
      System.out.println("modulo = "+ (a%b));
      break;
      default:
      System.out.println("Invalid input");
     }
   }
}
      