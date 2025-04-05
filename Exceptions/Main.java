import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void recursive(){
        recursive();
    }
    public static void mem(int[] arr1){
        arr1[arr1.length+1]=0;
        mem(arr1);
    }
    public static void main(String[] args) {
        /*
        //1.ArrayIndexOutOfBoundsException
        int Arr[] = {0,1,2,3,4};
        try {
            System.out.println(Arr[5]);

        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of bound exception");
        }
        */

        /*
        //2.ArithmeticException]
        try {
            int a = 10 / 0;}
        catch (ArithmeticException a){
            System.out.println("Arithmetic exception");
        }
        */

        /*
        //3.StackOverflowError
        try{
        recursive();
        }
        catch(StackOverflowError c){
            System.out.println("Stack Overflow Error");
        }
        */

        /*
        //4.OutOfMemoryError
        List<int[]> list = new ArrayList<>();
        try{
        while (true) {
            list.add(new int[1000000]);
            }
        }
        catch (OutOfMemoryError d){
            System.out.println("Out of Memory Error");
        }
        */
        /*
        //5.Custom Exception
        try {
            throw new MyCustomException("My Custom Exception");
        } catch (MyCustomException e) {
            System.out.println("Custom Exception caught: " + e.getMessage());
        }
        */

    }
}
class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}