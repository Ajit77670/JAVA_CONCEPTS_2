import java.util.Scanner;

public class ArmStrong_Number {
    
public static void main(String[] args) {


    // Using scanner will take input from user and pass the same as argument in ArmStrong() function.
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no:");
    int n =sc.nextInt();
    System.out.println(ArmStrong(n));


// By using this loop technique , we can find any armstrong no. between the defined range

//      for(int i=100;i<1000;i++){

//         if(ArmStrong(i)){
//             System.out.print(i + " ");
//         }
//      }
       
 }

static boolean ArmStrong(int n){

     int original = n; // Why we have keep the value of "n" in "original" because on the n we will perform the operation 
                       // and running loops , so there is chance in change in the no. value, so to comapare in the last with the obtained no.(n) 
                       //  with the "original" no.
     
    int sum = 0; // initialized sum = 0 , after cube the value of the individual digit will add with sum to obtain the final value.

    while(n>0) // we take while(n>0) bcuz till the all individual digit will get exected the loop will run.
    {
        int rem =n%10; // n%10 will give the last digit

        sum = sum + (rem*rem*rem); //  This will give the final value and that will comapred with original value.
                                    // rem*rem*rem -- to get the cube of individual digit and get add to the "sum" variable.   
        
        n=n/10; //  This will do autocasting and discard the remainder value and gives the remaining int digit.

    }

    if(sum == original){ // The obtained no (sum) is compared with the "original" value.
  
        return true; // if it is Armstrong it will return true.
 }
    return false;  // if not it will return false.

}

}
