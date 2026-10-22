import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println(getFactorial(5));




    }

    public static int getFactorial(int num){
        int fact = 1;
        while (num>=1){
            fact = fact*num;
            num -= 1;
        }
        return fact;
    }

    public static int getSumOfArray(int[] array, int low, int high){
        if(low == high){
            return array[low];
        }
        return array[low] + getSumOfArray(array, low+1,high);
    }


}

