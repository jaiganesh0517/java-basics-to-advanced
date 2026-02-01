/*In this phase we will learn about Conditional Statements
 It really helps in decision taking in programing*/

// If Statement -->Allow student to take admision in any particular course if he/she have 12th percentage above 80
float percentage = 80.01;
if(percentage > 80.00){
   System.out.println("Student is eligible to take any course");
}

//If else statements -->let user know that wehter he is eligible for voting or not if not then give remaining year
int age = 15;
if(age >= 18){
  System.out.println("Candidate is eligible for voting");
} else {
   System.out.println("Candidate is not eligible for voting and he should wait for "+ 18-age +" years");
}

//Nested if else --> Give student grade according to the percentage they //score(When we have to take decision on the basis of two or more condition)
float percentage = 75.75;
if(percentage > 80.00){
  System.out.println("Student got A grade");
} else if( 80.00 < percentage > 60.00){
  System.out.println("Student got B grade");
} else{
  System.out.println("Student got C grade");
}

//Switch Statements --> It's somehow similar to if-else-if Statements 
//we have to print name of days according to It's number 1.....7
int n = 6;
switch(n){
Case 1:
  System.out.println(Monday);
  break;
Case 2:
  System.out.println("Tuesday");
  break;
Case 3:
  System.out.println("Wednesday");
  break;
Case 4:
  System.out.println("Thursday");
  break;
Case 5:
  System.out.println("Friday");
  break;
Case 6:
  System.out.println("Saturday");
  break;
Case 7:
  System.out.println("Sunday");
  break;
default:
  System.out.println("Invalid input");
}