public class Shadowing_in_JAVA {
    
    static int a= 90;

    public static void main(String[] args) {
        
        
        
        System.out.println(a);
        
        int a =40; // The value of a will be shadow here.
        System.out.println(a);

        fun();


    }

    static void fun(){

        System.out.println(a);  // Here the value of "a" will be instance variable value i.e 90.

    }


}
