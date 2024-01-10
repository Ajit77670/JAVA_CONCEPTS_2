import java.util.Scanner;

public class Swapping_of_Two_No {
    
public static void main(String[] args) {

    swap();
    
}

static void swap(){

    int temp =0;
    Scanner sc = new Scanner (System.in);
   
    System.out.println("Print the Num1 : ");
    int num1 =sc.nextInt();

     System.out.println("Print the Num2 : ");
     int num2 =sc.nextInt();

     temp= num1;
     num1=num2;
     num2=temp;

   System.out.println("The update num1 is :" +num1);
   System.out.println("The update num2 is :" +num2);


}

}
