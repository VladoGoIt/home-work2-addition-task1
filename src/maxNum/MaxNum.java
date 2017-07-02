package maxNum;

import java.util.Scanner;


/**
 * Created by Volodymyr Dzhuhalyk on 01.07.2017.
 */
public class MaxNum {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        int[] arr = new int[4];

        for (int i=0; i < arr.length; i++ ) {
            arr[i] = in.nextInt();
        }
        int max = arr[0];
           for(int i = 0; i<arr.length; i++){
             if (max < arr[i])
                max = arr[i];

        }
        System.out.println("Cамое большое число: "+max);



    }

}
