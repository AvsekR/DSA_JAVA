// This is _java_learning_arc_'s phase zero
// less go....


/*
    Basic structure-

     package com.company;
     import java.util.Scanner;
     public class To{
      public static void main(String[] args){
          Scanner sc= new Scanner(System.in);
          int a= sc.nextInt();
          // Code
      }
     }
*/

/*
    Types of primitive data types-
     byte(1),int(4),float(4),short(2),long(8),double(8),char(2)(supports Unicode(Superset of ASCII)),boolean
*/

/*
    Types of Operators-

     1) Arithmetic- +,-,/,*,%,++,--
     2) Assignment- =,+=
     3) Comparison/Relational- ==,>=,<=,>,<,!=
     4) Logical- &&,||,!
     5) Bitwise- &,|
*/

/*
    Note - You cant scan int and string together in normal way with same scanner object
           instead  parse it
     Scanner sc= new Scanner(System.in);
     int a= Integer.parseInt(sc.nextLine());
     String b= sc.nextLine();
     System.out.print(a+b);
*/

/*
    Strings-

     In Java,String is a class but can also be used as data type
     Strings are immutable,i.e.,they cant be changed but updated
     String name= "John Wick"

    Methods on Strings-
     1) name.length();
     2) name.toLowerCase();
     3) name.toUpperCase();
     4) name.trim();                          -> returns a string leaving all spaces from original string
     5) name.substring(int start);            -> returns a substring starting from index start to end
     6) name.substring(int start,int end);    -> start index is included but not end index
     7) name.replace('s','a');
     8) name.startsWith("String");            -> returns  true if original string with given string
     9) name.endsWith("String");
    10) name.charAt(int a);                   -> returns character at the given index
    11) name.indexOf("String");               -> returns index(first occurrence) of the given string
    12) name.equals("John Wick");
*/

/*
    Conditionals-

     1) if-else-

      if(condition that returns boolean){
        // Statements
      }
      else{
        // Statements
      }

     2) switch-case-

       switch(var){       -> var can be int,char or string
         case c1:
            // Statements
            break;
         case c2:
            // Statements
            break;
         default:
            // Statements
      }

        switch-case with arrows-

       switch(var){
          case c1 -> // Statement;
          case c2 -> {
                       // Statements;
                     }
          default ->  // Statement;
*/

/*
    Loops-

     1) while loop-

      while(condition that returns boolean){
        // Statements
      }

     2) do-while loop-

      do{
       // Statements
      }while(condition);

    -> gets executed at least once
       while - checks the condition then executes the code
       do-while - executes the code and then checks the condition

     3) for loop-

      for(initialization;condition;update){
        // Statements
      }


     -> break - used to exit the loop irrespective of whether the condition is true or false
                whenever a break is encountered the control is sent outside the loop
     -> continue - used to immediately move to the next iteration of the loop
                   the control is taken to the next iteration thus skipping everything below "continue"
                   inside the loop for that iteration
*/

/*
    Arrays-

     int[] marks= new int [size of array];
       or
     int[] marks= {a,b,c,d};
     int[][] arr= new int [2][3];          -> 2-D array

    -> array.length() returns size of array

    To traverse 2-D array nested for loop is needed
*/

/*
    Methods-

    A method is a function written inside a class, since java is an object-oriented language
    we need to write method inside some class

     data_type name(parameters){
       // method body
     }

    -> int needs a return value but void doesn't

    Method call-

    A method can be called by creating an object of the class in which the method exists
    followed by the method call

     class obj= new class();     -> object creation
     obj.mySum(a,b);             -> method call upon an object

     -> the values a and b are copied from main, thus changing them in the method won't affect the values in main
        but array elements can be updated outside the main too

     static -> static keyword is used to associate a method of a given class with the class rather than the object
               static method in class is shared by all the objects


     Method Overloading -> Two or more methods can have same name but different parameters

      void foo();
      void foo(int a);
      void foo(int a,int b);

      -> Method overloading can't be performed by changing return type

     Variable arguments(Varargs)-

     public static void foo(int ...arr){
       // Statements           -> arr is available here as int [] arr
     }

     So foo can be called with any no. of arguments
*/

