public class Block_and_static_Block_Concept
 {

// Point 1 to remember : 

// Q: Which will execute first static block or main method?

/*Ans : The static blocks always execute first before the main() method in Java because 
the compiler stores them(Static block) in memory at the time of class loading and before the object creation. 
Here, the compiler executes all the static blocks first, and after finishing the static block execution, 
it invokes the main() method.
*/

int a=20;



// Below is the syntax for declaring static block :
static{
        int c= 50;
    
        System.out.println(c);

      }

  
public static void main(String[] args) {
    
int a =10;
System.out.println(a);

String name ="Ajit"; // initialized String object ref variable i.e name="Ajit" , rememeber String are immutable.



{

 // Point 2 to remember :  int a=30; // Variable which initialized outside can not be reinitialized inside the block
     
    a=40; // But we can update or modify the value of varibale inside the block which is declared outside .

     int b=90;
     System.out.println(b);


     name ="Kumar"; // we can chnage/update the String original "name" here 
     //because we are not initilalizing again "String name = "Kumar", we are just changing the value.
     //String once created can not be chnged i.e Strings are immutable , here we are changing the ref value only not initializing it again.
     System.out.println(name);

}
  // Point 3 to remember :
  //  System.out.println(b); // Variable which intialized inside the block cannot be used outside.


    System.out.println(a); // if we change the value of variable inside the block the same will get change to the original value i.e outside the block. 

    System.out.println(name);
  

  // Point 4 to remember :

    int b=200;

    // Variable which initialized inside the block have scope till inside only and the same variable can be intialized outside the block.

 
// Point 5 to remember : same scope rules goes for loops i.e declared variable outside
// can be update/modify inside the loops but cant initialize again.

/*  for(int i=0; i<=n;i++){

     int a =20;      // can not be initialized again as the same variable initialized outside.
} */


 }

 

}




