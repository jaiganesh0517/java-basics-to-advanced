// This program will let you know about the Data types and Operator in java with some operation.
class Operation {
      //Data Types 
      int a = 10; //integer
      float b = 10.6;//Floating Point number
      boolean bl = true;//Boolean
      long l = 1000000;//long similar to integer but greater in range
      char ch = 'a';//Character for inputing alphabets
      String str = "StringDataType;//For taking input of strings
      public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter to Number on that Operation is going to perform");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a + b; // Addition Operation
            System.out.println("Addition of this numbers are : "+ sum);
            int diff = a - b; // Substraction Operation
            System.out.println("Difference of this numbers are : "+ diff);
            int diff = a * b; // Multiplication Operation
            System.out.println("Multiplication of this numbers are : "+ mul);
            int diff = a / b;  // Division Operation
            System.out.println("Division of this numbers are : "+ div);
            int mod = a % b; // Modulo Operation
            System.out.println("Modulo of this numbers are : "+ mod);
      }
}
