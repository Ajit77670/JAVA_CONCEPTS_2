import java.util.Scanner;

public class Adjacent_String_Char_Count {
    
static int  adjacentCharacter_count(String s){

int count =0; //initialize the counter as 0 , so that if we get the adjacent same char we can increase the count.


for(int i=1 ; i<s.length(); i++) //We have taken i=1 in order to compare the char at i-1 in the given String;
{

    if(s.charAt(i) == s.charAt(i-1)) // This will compare the i'th with i-1 'th position.
    {
        
        count++; // This will increment the counter upon finding the adjacent same character.

    }

}

    return count;
}


public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in) ;
    

    System.out.println("Enter the String");

    String word =sc.next();
    
    System.out.println(adjacentCharacter_count(word));
}




}




