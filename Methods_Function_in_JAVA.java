import java.util.Scanner;

public class Methods_Function_in_JAVA {
    
public static void main(String[] args) {
    

    int ans =sum2();
    System.out.println(ans); //Ex:0 Output , Here asking while calling the sum2 function it is asking the output at runtime that is the use of Scanner class .

     System.out.println(sum(10, 20)); //Ex:1 output, Here while calling the sum funtion its asking the value at compile time.

     System.out.println(myGreet("Ajit"));  //Ex:2 output

     String naam = "Bunty"; //Ex:3 output
     greet(naam);


    
    

}
//Ex: 0
static int sum2(){

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Num1:");
    int num1 =sc.nextInt();
    System.out.println("Enter the Num2:");
    int num2 =sc.nextInt();
    int sum = num1 + num2;
    return sum;

    
}


//EX:1
static int sum(int a, int b){

    int c= a+b;

    return c ;
}

//Ex:2
static String myGreet(String name){

    String msg ="Hello " + name;

    return msg;
}

//Ex:3
static void greet(String naam){
    System.out.println(naam);
}




}
