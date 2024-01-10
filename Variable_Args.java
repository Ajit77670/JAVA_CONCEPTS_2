import java.util.Arrays;

public class Variable_Args {

public static void main(String[] args) {
    
fun(12,3,4,5,77,888);

fun2("Sumit","Bunty","Maa","Sweta","Ajit");

fun3(12, 11, "Ajit","Bunty");  // How to print int output with String varargs // Q:Pending

}

    //Ex:1
    static void fun(int ...v){ // Here the defined data type is "int" which will create the Arrays of integer.

        System.out.println(Arrays.toString(v)); // To visulaize the output we need string format hence converting the Arrays onto the String.
    }

    //EX:2
    static void fun2(String ...a){ // Here the defined data type is "String" which will create the Arrays of String.

        System.out.println(Arrays.toString(a));
    }

    //Ex:3
    static void fun3(int a,int b, String ...c){

    System.out.println(Arrays.toString(c));
}


}
