package prgramming1;
import java.util.*;
public class Week7Lab1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int [] numbers = {5,2,4,1,3};
        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));


        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i]; }

        int avg = total/numbers.length;

        System.out.println( "The minimum number is: " + numbers[0]);
        System.out.println( "The maximum number is: " + numbers[(numbers.length-1)]);
        System.out.println( "The average number is: " + avg);
    }
}