class Operator{
  public static void main(String [] args){
     // Assignment Operator --> = is used to assign value in any variable
     int a = 5; 
     // Arithmetic Operator --> + , - , * , / , % is used to perform mathematical operation 
     int a = 10;
     int b = 9;
     System.out.println( a + b ); // 19
     System.out.println( a - b ); // 1
     System.out.println( a * b ); // 90
     System.out.println( a / b ); // 1
     System.out.println( a % b ); // 1
     /* BODMAS its a very and useful concept that illustrate how to decide in which order we have to perform 
     B--> BRACKET
     O--> ORDER
     D--> DIVIDE
     M--> MULTIPLY
     A--> ADDITION
     S--> SUBTRACTION */
     System.out.println( 9 / 3 / 3 ); // 1
     System.out.println( 9 / ( 3 / 3 )); // 9
     System.out.println( 9 / (3 / 3  ); // 3
    //Shorthand operators --> += , -= , *= , /= , %= these are basically used to calculate the expression very easily and at the same time take less space.
    //Unary operators--> i++ , ++i ,
    int c = 10;
    System.out.println(c++);//10
    System.out.println(c);//11
    System.out.println(++c);//12
    System.out.println(c);//12
    System.out.println(c--);//12
    System.out.println(c);//11
    System.out.println(--c);//10
    System.out.println(c);//10
    //Relational Operator--> == , > , >= , < , <= , !=
    
